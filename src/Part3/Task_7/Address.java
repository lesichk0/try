package Part3.Task_7;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    // Фабричний метод для створення Null-об'єкта Address
    public static Address nullAddress() {
        return NullAddress.getInstance();
    }
}
