package Part1.InlineClass.version2;

public class Address {
    private final String street;
    private final String city;
    private final String country;

    public Address(String street, String city, String country){
        this.street = street;
        this.city = city;
        this.country = country;
    }
    @Override
    public String toString() {
        return "Address: " + street + ", " + city + ", " + country;
    }
}