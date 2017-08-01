import javax.sql.rowset.serial.SerialStruct;

/**
 * Created by Maxim on 01.08.2017.
 */
public class User {
    // Поля : логин, пароль, mEmail, имя, возраст

    // Если поле помечено модификатором private, то перед названием поля, необходимо
    // добавить приставку m-
    // Ограничение доступа к полям класса.

    // Закрытые Поля класса
    private String mLogin; // login
    private String mPassword;
    private String mEmail;
    private String mName;
    private int mAge;

    // Пользовательский конструктор
    // Если мы описываем пользовательский конструктор, то конструктор по-умолчанию,
    // необходимо описать явно
    User(String _login,
         String _password,
         String _email,
         String _name,
         int _age) {

        mLogin = _login;
        mPassword = _password;
        mEmail = _email;
        mName = _name;
        mAge = _age;

    }

    // Конструктор по умолчанию. Инициализирует поля по-умолчанию
    User() {
        mLogin = null;
        mPassword = null;
        mEmail = null;
        mName = null;
        mAge = 0;
    }

    // Доступ к полям в ООП происходит с помощью методов доступа. set- и get- методы
    // Метод set - изменяет значение (для записи)
    // Метод get - возвращает значение (для чтения)

    String getLogin() {
        return mLogin;
    }

    void setLogin(String _login) {
        mLogin = _login;
    }

    String getPassword() {
        return mPassword;
    }

    void setPassword(String _password) {
        mPassword = _password;
    }

    String getEmail() {
        return mEmail;
    }

    void setEmail(String _email) {
        mEmail = _email;
    }

    String getName() {
        return mName;
    }

    void setName(String _name) {
        mName = _name;
    }

    int getAge() {
        return mAge;
    }

    void setAge(int _age) {
        if (_age < 0 || _age > 150) {
            return;
        }

        mAge = _age;
    }

    // Метод, выводящий на экран значения полей объекта
    void show() {
        System.out.println("Логин user2 : " + mLogin +
                "\nПароль user2 : " + mPassword +
                "\nИмя user2 : " + mName +
                "\nEmail user2 : " + mEmail +
                "\nВозраст user2 : " + mAge);
    }
}
