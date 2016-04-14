package Entitites;

public class Book {

    private String name;
    private String serial;
    private float price;
    private int numberOfCopies;

    public Book(String name, String serial, float price, int numberOfCopies) {
        this.name = name;
        this.serial = serial;
        this.price = price;
        this.numberOfCopies = numberOfCopies;

    } //Consturctor

    public Book(String name, String serial, float price) {
        this.name = name;
        this.serial = serial;
        this.price = price;

    } //Consturctor

    public void setName(String x) {
        name = x;
    }

    public String getName() {
        return name;
    }

    public void setSerial(String x) {
        serial = x;
    }

    public String getSerial() {
        return serial;
    }

    public void setPrice(float x) {
        price = x;
    }

    public float getPrice() {
        return price;
    }

    public void setNumberOfCopies(int x) {
        numberOfCopies = x;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

}
