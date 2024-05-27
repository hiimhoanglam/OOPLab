package week9.phonebook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook list = new PhoneBookList();

        // Creating some sample students
        Student s1 = new Student("John", "Doe", "123456789");
        Student s2 = new Student("Alice", "Smith", "987654321");

        // Adding students to the phone book
        list.addPerson(s1);
        list.addPerson(s2);

        // Searching for a student by last name
        System.out.println("Searching for student by last name:");
        System.out.println(list.searchByLastname("Smith"));

        // Searching for a student by phone number
        System.out.println("\nSearching for student by phone number:");
        System.out.println(list.searchByNumber("123456789"));

        // Deleting a student by phone number
        list.deleteByNumber("123456789");
        System.out.println("\nAfter deleting student by phone number:");
        System.out.println(list.searchByNumber("123456789")); // Should return null

        System.out.println("------------------------");

        // Creating a phone book instance
        PhoneBook map = new PhoneBookMap();

        // Adding students to the phone book
        map.addPerson(s1);
        map.addPerson(s2);

        // Searching for a student by last name
        System.out.println("Searching for student by last name:");
        System.out.println(map.searchByLastname("Smith"));

        // Searching for a student by phone number
        System.out.println("\nSearching for student by phone number:");
        System.out.println(map.searchByNumber("123456789"));

        // Deleting a student by phone number
        map.deleteByNumber("123456789");
        System.out.println("\nAfter deleting student by phone number:");
        System.out.println(map.searchByNumber("123456789")); // Should return null
    }
}
