package week6.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", "123 Main St");
        System.out.println("Person 1: " + person1);

        Person person2 = new Person("Jane Smith", "456 Elm St");
        person2.setAddress("789 Oak St");
        System.out.println("Person 2: " + person2);

        // Test cases for Staff class
        Staff staff1 = new Staff("Alice Johnson", "101 Maple St", "ABC High School", 50000.0);
        System.out.println("\nStaff 1: " + staff1);

        staff1.setPay(55000.0);
        System.out.println("Updated pay for Staff 1: " + staff1.getPay());

        // Test cases for Student class
        Student student1 = new Student("Bob Brown", "222 Pine St", "Computer Science", 2, 10000.0);
        System.out.println("\nStudent 1: " + student1);

        student1.setYear(3);
        System.out.println("Updated year for Student 1: " + student1.getYear());

        // Additional test cases for Staff and Student classes
        Staff staff2 = new Staff("Eve Wilson", "303 Cedar St", "XYZ College", 60000.0);
        System.out.println("\nStaff 2: " + staff2);

        Student student2 = new Student("Grace Lee", "444 Walnut St", "Mathematics", 4, 12000.0);
        System.out.println("Student 2: " + student2);
    }
}
