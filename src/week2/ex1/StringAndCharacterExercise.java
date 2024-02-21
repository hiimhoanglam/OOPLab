package week2.ex1;

import java.util.Scanner;

public class StringAndCharacterExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        testString(sc);
//        testCountVowelsAndDigits(sc);
//        testCipherCaesarCode(sc);
//        testDecipherCaesarCode(sc);
//        testHexString(sc);
//        testBinaryToDecimal(sc);
//        testHexadecimalToDecimal(sc);
        testOctalToDecimal(sc);

    }
    public static String reverseString(String inStr) {
        StringBuilder result = new StringBuilder();
        for (int i = inStr.length() - 1; i >= 0; i--) {
            result.append(inStr.charAt(i));
        }
        return result.toString();
    }
    public static void testString(Scanner sc) {
        System.out.println("Enter a String : ");
        String inStr = sc.next();
        String result = reverseString(inStr);
        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + result + "\"" );
    }
    public static int countVowels(String inStr) {
        inStr = inStr.toLowerCase();
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == 'u' || inStr.charAt(i) == 'e' ||
            inStr.charAt(i) == 'o' || inStr.charAt(i) == 'a' || inStr.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }
    public static int countDigits(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isDigit(inStr.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static void testCountVowelsAndDigits(Scanner sc) {
        System.out.println("Enter a String: ");
        String inStr = sc.next();
        int numVowels = countVowels(inStr);
        int numDigits = countDigits(inStr);
        System.out.printf("Number of vowels %d (%.2f%%)\n",numVowels, (double) numVowels * 100 / inStr.length());
        System.out.printf("Number of digits %d (%.2f%%)",numDigits, (double) numDigits * 100 / inStr.length());
    }
    public static String phoneKeyPadA(String inStr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                if (ch >= 'A' && ch <= 'C') {
                    result.append("2");
                } else if (ch >= 'D' && ch <= 'F') {
                    result.append("3");
                } else if (ch >= 'G' && ch <= 'I') {
                    result.append("4");
                } else if (ch >= 'J' && ch <= 'L') {
                    result.append("5");
                } else if (ch >= 'M' && ch <= 'O') {
                    result.append("6");
                } else if (ch >= 'P' && ch <= 'S') {
                    result.append("7");
                } else if (ch >= 'T' && ch <= 'V') {
                    result.append("8");
                } else if (ch >= 'W' && ch <= 'Z') {
                    result.append("9");
                }
            } else {
                // If it's not a letter, just append the character itself
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static String phoneKeyPadB(String inStr) {
        inStr = inStr.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    result.append("2");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result.append("3");
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result.append("4");
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result.append("5");
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result.append("6");
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result.append("7");
                    break;
                case 't':
                case 'u':
                case 'v':
                    result.append("8");
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result.append("9");
                    break;

            }
        }
        return result.toString();
    }
    public static void testPhoneKeyPad(Scanner sc) {
        System.out.println("Enter the string: ");
        String inStr = sc.next();
        String result = phoneKeyPadB(inStr);
        System.out.println("The result is " + result);
    }
    public static String cipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == 'X') {
                result.append('A');
            }
            else if (inStr.charAt(i) == 'Y') {
                result.append('B');
            }
            else if (inStr.charAt(i) == 'Z') {
                result.append('C');
            }
            else {
                result.append((char) (inStr.charAt(i) + 3));
            }
        }
        return result.toString();
    }
    public static void testCipherCaesarCode(Scanner sc) {
        System.out.println("Enter a plaintext string");
        String inStr = sc.next();
        System.out.println("The ciphertext string is: " + cipherCaesarCode(inStr));
    }
    public static String decipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == 'A') {
                result.append('X');
            }
            else if (inStr.charAt(i) == 'B') {
                result.append('Y');
            }
            else if (inStr.charAt(i) == 'C') {
                result.append('Z');
            }
            else {
                result.append((char)(inStr.charAt(i) - 3));
            }
        }
        return result.toString();
    }
    public static void testDecipherCaesarCode(Scanner sc) {
        System.out.println("Enter a ciphertext string: ");
        String inStr = sc.next();
        System.out.println("The plaintext string is: " + decipherCaesarCode(inStr));
    }
    public static boolean isHexString(String hexStr) {
        hexStr = hexStr.toUpperCase();
        for (int i = 0; i < hexStr.length(); i++) {
            if (!(Character.isDigit(hexStr.charAt(i)) ||
                    hexStr.charAt(i) >= 'A' && hexStr.charAt(i) <= 'F')) {
                return false;
            }
        }
        return true;
    }
    public static void testHexString(Scanner sc) {
        System.out.println("Enter a hex string: ");
        String inStr = sc.next();
        if (isHexString(inStr)) {
            System.out.printf("\"%s\" is a hex string", inStr);
        }
        else {
            System.out.printf("\"%s\" is NOT a hex string", inStr);
        }
    }
    public static int binaryToDecimal(String binStr) {
        if (binStr.contains("2") || binStr.contains("3") || binStr.contains("4") ||
                binStr.contains("5") ||  binStr.contains("6") ||  binStr.contains("7") ||
                binStr.contains("8") || binStr.contains("9")) {
            return -1;
        }
        int decimal = 0;
        int power = 0;

        // Start from the rightmost (least significant) bit
        for (int i = binStr.length() - 1; i >= 0; i--) {
            // Convert char to int ('0' -> 0, '1' -> 1)
            int bit = binStr.charAt(i) - '0';
            // Add the bit multiplied by the corresponding power of 2
            decimal += bit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
    public static void testBinaryToDecimal(Scanner sc) {
        System.out.println("Enter a Binary string: ");
        String binStr = sc.next();
        if (binaryToDecimal(binStr) == -1) {
            System.out.printf("Error: invalid binary string \"%s\"",binStr);
        }
        else {
            System.out.printf("The equivalent decimal number for binary \"%s\" is : %d",
                    binStr, binaryToDecimal(binStr));
        }
    }
    public static int hexadecimalToDecimal(String hexStr) {
        int decimal = 0;
        int power = 0;

        // Start from the rightmost (least significant) digit
        for (int i = hexStr.length() - 1; i >= 0; i--) {
            char digit = hexStr.charAt(i);
            if (digit > 'f' && digit <= 'z') {
                return -1;
            }
            int digitValue;

            // Convert hexadecimal digit to its decimal value
            if (Character.isDigit(digit)) {
                digitValue = digit - '0';
            } else {
                digitValue = Character.toUpperCase(digit) - 'A' + 10;
            }

            // Add the digit multiplied by the corresponding power of 16
            decimal += digitValue * Math.pow(16, power);
            power++;
        }
        return decimal;
    }
    public static void testHexadecimalToDecimal(Scanner sc) {
        System.out.println("Enter a Hexadecimal string: ");
        String binStr = sc.next();
        if (hexadecimalToDecimal(binStr) == -1) {
            System.out.printf("Error: invalid hexadecimal string \"%s\"",binStr);
        }
        else {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is : %d",
                    binStr, hexadecimalToDecimal(binStr));
        }
    }
    public static int octalToDecimal(String octalStr) {
        int decimal = 0;
        int power = 0;
        // Start from the rightmost (least significant) digit
        for (int i = octalStr.length() - 1; i >= 0; i--) {
            int digit = octalStr.charAt(i) - '0';
            // Add the digit multiplied by the corresponding power of 8
            decimal += digit * Math.pow(8, power);
            power++;
        }
        return decimal;
    }

    public static void testOctalToDecimal(Scanner sc) {
        System.out.println("Enter an octal string:");
        String octalString = sc.next();
        int decimalNumber = octalToDecimal(octalString);
        System.out.println("The equivalent decimal number is: " + decimalNumber);
    }
    public static void testRadixNToDecimal(Scanner sc) {
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String myString = sc.next();
        int decimalNum = Integer.parseInt(myString,radix);
        System.out.println("The equivalent decimal number \"" + myString + "\" is: " + decimalNum);
    }
}
