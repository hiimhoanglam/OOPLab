package week1.ex31;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        forLoop(1,100);
        whileLoop(1,100);
        doWhileLoop(1,100);
        countNumberLoop(1,100);
        sumSquares();
        twoSum();
    }
    public static void forLoop(int lowerBound, int upperBound) {
        int sum = 0;
        double average;
        for (int number = lowerBound; number <= upperBound; number++) {
            sum += number;
        }
        average = (double) sum / (upperBound - lowerBound + 1);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
    public static void whileLoop(int lowerBound, int upperBound) {
        int sum = 0;
        double average;
        int number = lowerBound;
        while (number <= upperBound) {
            sum += number;
            number++;
        }
        average = (double) sum / (upperBound - lowerBound + 1);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
    public static void doWhileLoop(int lowerBound, int upperBound) {
        int sum = 0;
        double average;
        int number = lowerBound;
        do {
            sum += number;
            number++;
        } while (number <= upperBound);
        average = (double) sum / (upperBound - lowerBound + 1);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
    public static void countNumberLoop(int lowerBound, int upperBound) {
        int count = 0;
        for (int number = lowerBound; number <= upperBound; number++) {
            count++;
        }
        System.out.println(count);
    }
    public static void sumSquares() {
        int sum = 0;
        for (int i = 1; i <+ 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
    public static void twoSum() {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            }
            else {
                sumOdd += number;
            }
        }
        absDiff = sumOdd > sumEven ? sumOdd - sumEven : sumEven - sumOdd;
        System.out.println(absDiff);
    }
}
