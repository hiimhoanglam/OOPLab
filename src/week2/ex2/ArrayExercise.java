package week2.ex2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] array = createArray(sc);
//        printArray(array);
//        simpleGradesStatistics(sc);
//        testHexadecimalToBinary(sc);
        testDecimalToHexadecimal(sc);
    }
    public static int[] createArray(Scanner sc) {
        System.out.println("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        if (NUM_ITEMS < 0) {
            return null;
        }
        int[] result = new int[NUM_ITEMS];
        System.out.println("Enter the value of all items (seperated by space)");
        for (int index = 0; index < NUM_ITEMS; index++) {
            result[index] = sc.nextInt();
        }
        return result;
    }
    public static void printArray(int[] array) {
        if (array == null) {
            return;
        }
        System.out.println("The values are: " + Arrays.toString(array));
    }
    public static int[] generateStudentGrades(Scanner sc) {
        System.out.println("Enter the number of student: ");
        final int NUM_STUDENTS = sc.nextInt();
        if (NUM_STUDENTS < 0) {
            return null;
        }
        int[] studentsGrades = new int[NUM_STUDENTS];
        for (int i = 1; i <= NUM_STUDENTS; i++) {

            int grade;
            do {
                System.out.println("Enter the grade for student " + i);
                grade = sc.nextInt();
            } while (grade < 0 || grade > 100);
            studentsGrades[i-1] = grade;
        }
        return studentsGrades;
    }
    public static void simpleGradesStatistics(Scanner sc) {
        int[] studentGrade = generateStudentGrades(sc);
        if (studentGrade == null) {
            return;
        }
        int sum = 0;
        for (int grade : studentGrade) {
            sum += grade;
        }
        System.out.printf("The average is %.2f\n", (double) sum / studentGrade.length);
        List<Integer> list = Arrays.asList(Arrays.stream(studentGrade).boxed().toArray(Integer[]::new));
        System.out.printf("The minimum is %d\n", Collections.min(list));
        System.out.printf("The maximum is %d", Collections.max(list));
    }
    public static String hexadecimalToBinary(String hexStr) {
        final String[] HEX_BITS = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        hexStr = hexStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexStr.length(); i++) {
            char digit = hexStr.charAt(i);
            if (Character.isDigit(digit)) {
                result.append(HEX_BITS[digit - '0']).append(" ");
            }
            else {
                result.append(HEX_BITS[digit - 'A' + 10]).append(" ");
            }
        }
        return result.toString();
    }
    public static void testHexadecimalToBinary(Scanner sc) {
        System.out.println("Enter a hexadecimal string: ");
        String hexStr = sc.next();
        String result = hexadecimalToBinary(hexStr);
        if (result == null) {
            System.out.println("Invalid hexadecimal string");
        }
        else {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s",
                    hexStr, result);
        }
    }
    public static String decimalToHexadecimal(int positiveInteger) {
        // If the input is not positive, return an empty string
        if (positiveInteger <= 0) {
            return null;
        }

        StringBuilder hexadecimal = new StringBuilder();

        // Define characters for hexadecimal digits
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        // Convert the decimal number to hexadecimal
        while (positiveInteger > 0) {
            int remainder = positiveInteger % 16;
            hexadecimal.insert(0, hexDigits[remainder]);
            positiveInteger /= 16;
        }

        return hexadecimal.toString();
    }
    public static void testDecimalToHexadecimal(Scanner sc) {
        System.out.print("Enter a positive decimal number: ");
        int decimalNumber = sc.nextInt();

        String hexadecimalString = decimalToHexadecimal(decimalNumber);
        if (hexadecimalString != null) {
            System.out.println("Equivalent hexadecimal string: " + hexadecimalString);
        } else {
            System.out.println("Invalid input! Please enter a positive decimal number.");
        }
    }

}
