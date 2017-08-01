/**
 * Created by Maxim on 01.08.2017.
 */
 class Cat {
    // Alt + Insert - тот самый хоткей

    private String name;
    private String color;
    private int countOfLegs;
    private String nameOfOwner;
    private String city;
    private String favoriteFood;

    // Ключевое слово this, означает, что член класса (поле, или метод) пренадлежит
    // ИСКЛЮЧИТЕЛЬНО объекту этого класса

    public Cat(String name, String color, int countOfLegs, String nameOfOwner, String city, String favoriteFood) {
        this.name = name;
        this.color = color;
        this.countOfLegs = countOfLegs;
        this.nameOfOwner = nameOfOwner;
        this.city = city;
        this.favoriteFood = favoriteFood;
    }

    public Cat(String name, String color, String favoriteFood) {
        this.name = name;
        this.color = color;
        this.favoriteFood = favoriteFood;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
