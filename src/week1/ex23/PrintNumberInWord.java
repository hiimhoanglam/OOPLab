package week1.ex23;

public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 5;
        printNumber(number);
    }
    public static void printNumber(int number) {
        if (number == 1) {
            System.out.println("ONE");
        }
        else if (number == 2) {
            System.out.println("TWO");
        }
        else if (number == 3) {
            System.out.println("THREE");
        }
        else if (number == 4) {
            System.out.println("FOUR");
        }
        else if (number == 5) {
            System.out.println("FIVE");
        }
        else if (number == 6) {
            System.out.println("SIX");
        }
        else if (number == 7) {
            System.out.println("SEVEN");
        }
        else if (number == 8) {
            System.out.println("EIGHT");
        }
        else if (number == 9) {
            System.out.println("NINE");
        }
        else if (number == 10) {
            System.out.println("TEN");
        }
        switch (number) {
            case 1:
                System.out.println("ONE");
            case 2:
                System.out.println("TWO");
            case 3:
                System.out.println("THREE");
            case 4:
                System.out.println("FOUR");
            case 5:
                System.out.println("FIVE");
            case 6:
                System.out.println("SIX");
            case 7:
                System.out.println("SEVEN");
            case 8:
                System.out.println("EIGHT");
            case 9:
                System.out.println("NINE");
            case 10:
                System.out.println("TEN");
            default:
                System.out.println("Error");
        }
    }
}
