package week4.composition.ex22;

import week4.composition.ex21.Author;

public class TestBook {
    public static void main(String[] args) {
        // Declare an array of Authors with size 2
        Author[] authors = new Author[2];

        // Create instances of Author class and assign them to the array
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // Call the toString() method of Book class and print the result

    }
}
