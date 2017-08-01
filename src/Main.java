public class Main {

    public static void main(String[] args) {
        // Создаём объект класса User
        User user1 = new User();

        // Записываем данные в поля
        user1.setLogin("Login1");
        user1.setPassword("Password1");
        user1.setName("Name1");
        user1.setEmail("email1@gmail.com");
        user1.setAge(20);

        // Выводим данные об объекте на экран
        // \n - перенос строки
        System.out.println("Логин user1 : " + user1.getLogin() +
                "\nПароль user1 : " + user1.getPassword() +
                "\nИмя user1 : " + user1.getName() +
                "\nEmail user1 : " + user1.getEmail() +
                "\nВозраст user1 : " + user1.getAge());

        // Записываем данные, с помощью конструктора пользовательского
        User user2 = new User("Login2",
                "Password2",
                "Email2",
                "Name2",
                30);


        user2.show();
    }
}
