package hw_week2.ex3;

import java.util.Scanner;

public class StringAndCharacterHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        testExchangeCipher(sc);
//        testPalindromicWord(sc);
        testPalindromicPhrase(sc);
    }
    public static void exchangeCipher(String inStr) {
        StringBuilder string = new StringBuilder();
        for (int index = 0; index < inStr.length(); index++) {
            char resultChar = (char) ('A' + 'Z' - inStr.charAt(index));
            string.append(resultChar);
        }
        System.out.println("The cipher text string is: " + string);
    }
    public static void testExchangeCipher(Scanner sc) {
        System.out.println("Enter a plaintext string: ");
        exchangeCipher(sc.next().toUpperCase());
    }
    public static boolean isPalindromicWord(String inStr) {
        if (inStr == null || inStr.length() == 0 || inStr.equals(" ")) {
            System.out.println("Invalid input");
            return false;
        }
        int forwardIdx = 0;
        int backwardIdx = inStr.length() - 1;
        while (forwardIdx < backwardIdx) {
            if (inStr.charAt(forwardIdx) != inStr.charAt(backwardIdx)) {
                return false;
            }
            forwardIdx++;
            backwardIdx--;
        }
        return true;
    }
    public static void testPalindromicWord(Scanner sc) {
        System.out.println("Enter your word: ");
        String input = sc.next();
        if (isPalindromicWord(input.toLowerCase())) {
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is not a palindrome");
        }
    }
    public static boolean isPalindromicPhrase(String inStr) {
        if (inStr == null || inStr.length() == 0 || inStr.equals(" ")) {
            System.out.println("Invalid input");
            return false;
        }
        int forwardIdx = 0;
        int backwardIdx = inStr.length() - 1;
        while (forwardIdx < backwardIdx) {
            while (!(inStr.charAt(forwardIdx) >= 'a' && inStr.charAt(forwardIdx) <= 'z')) {
                forwardIdx++;
            }
            while (!(inStr.charAt(backwardIdx) >= 'a' && inStr.charAt(backwardIdx) <= 'z')) {
                backwardIdx--;
            }
            if (inStr.charAt(forwardIdx) != inStr.charAt(backwardIdx)) {
                return false;
            }
            forwardIdx++;
            backwardIdx--;
        }
        return true;
    }
    public static void testPalindromicPhrase(Scanner sc) {
        System.out.println("Enter your line: ");
        String input = sc.nextLine();
        if (isPalindromicPhrase(input.toLowerCase())) {
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is not a palindrome");
        }
    }
}
