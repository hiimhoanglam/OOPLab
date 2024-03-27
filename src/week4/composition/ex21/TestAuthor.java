package week4.composition.ex21;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("Name is: " + ahTeck.getName()); // Test getter
        System.out.println("Email is: " + ahTeck.getEmail()); // Test getter
        System.out.println("Gender is: " + ahTeck.getGender()); // Test getter
    }
}
