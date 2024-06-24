package Part1.InlineClass.version2;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Street", "City", "Country");

        Person person = new Person("John Doe", address);

        System.out.println("Person: " + person.getName() + person.getAddress());
    }
}
