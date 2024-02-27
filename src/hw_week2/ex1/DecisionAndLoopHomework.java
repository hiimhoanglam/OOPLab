package hw_week2.ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DecisionAndLoopHomework {
    public static void main(String[] args) {
//        guessNumber();
        guessWord();
    }
    public static void guessNumber() {
        Random random = new Random();
        guessNumber(random.nextInt(100),new Scanner(System.in) );
    }
    public static void guessNumber(int number, Scanner sc) {
        System.out.println("Key in your guess");
        int input = sc.nextInt();
        int trial = 1;
        while (input != number) {
            if (input > number) {
                System.out.println("Try lower");
            }
            if (input < number) {
                System.out.println("Try higher");
            }
            trial++;
            input = sc.nextInt();
        }
        System.out.println("You got it in " + trial + "trials");
    }
    public static void guessWord() {
        List<String> words = new ArrayList<>();
        Random random = new Random();
        try {
            FileReader fileReader = new FileReader("D:\\OOP2\\src\\hw_week2\\ex1\\words_alpha.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.readLine() != null) {
                words.add(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        guessWord(words.get(random.nextInt(words.size())), new Scanner(System.in));

    }
    public static void guessWord(String guessedString, Scanner sc) {
        boolean[] array = new boolean[guessedString.length()];
        int trial = 1;
        System.out.println("Key in one character or your guess word(only lower case - no number/special characters");
        String input = sc.next();
        while (true) {
            if (input.length() == 1) {
                int count = 0;
                for (int charIndex = 0; charIndex < guessedString.length(); charIndex++) {
                    if (guessedString.charAt(charIndex) == input.charAt(0) || array[charIndex]) {
                        array[charIndex] = true;
                        count++;
                    }
                }
                if (count == guessedString.length()) {
                    break;
                }
            }
            else {
                if (input.equals(guessedString)) {
                    break;
                }
            }
            StringBuilder currentString = new StringBuilder();
            for (int index = 0; index < array.length; index++) {
                if (array[index]) {
                    currentString.append(guessedString.charAt(index));
                }
                else {
                    currentString.append("_");
                }
            }
            System.out.println("Trial " + trial + ": " + currentString);
            trial++;
            System.out.println("Key in one character or your guess word(only lower case - no number/special characters");
            input = sc.next();
        }
        System.out.println("Congratulations!");
        System.out.println("You got it in " + trial + " trials");
    }
}
