package hw_week2.ex2;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        testSquarePattern(sc);
//        testCheckerPattern(sc);
//        testTimeTable(sc);
//        testTriangularPattern(sc);
//        testBoxPattern(sc);
        testHillPattern(sc);
    }
    public static void testSquarePattern(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        squarePattern(size);
    }
    public static void squarePattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("#");
                if (col != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                if (row % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print((2 * col) + " ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
         */
    }
    public static void testCheckerPattern(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        checkerPattern(size);
    }
    public static void checkerPattern(int n) {
        for (int row = 0; row < n; row++) {
            if (row % 2 != 0) {
                System.out.print(" ");
            }
            for (int col = 0; col < n; col++) {
                System.out.print("#");
                if (col != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void timeTable(int n) {
        System.out.print(" * |");
        for (int row = 1; row <= n; row++) {
            System.out.printf("%4d", row);
        }
        System.out.println();
        for (int row = 1; row <= n; row++) {
            System.out.printf("%2d |",row);
            for (int col = 1; col <= n; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
    public static void testTimeTable(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        timeTable(size);
    }
    public static void triangularPatternX(int n) {
        System.out.println("Pattern a");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern b");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col >= row) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row >= col) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int row = n - 1; row >= 0; row--) {
            for (int col = 0; col < n; col++) {
                if (row <= col) {
                    System.out.print(" #");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void testTriangularPattern(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        triangularPatternX(size);
    }
    public static void boxPatternX(int n) {
        System.out.println("Pattern A");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == n-1) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern B");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row == col) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row + col == n - 1) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row + col == n - 1 || row == col) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void testBoxPattern(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        boxPatternX(size);
    }
    public static void hillPatternX(int n) {
        System.out.println("Pattern A");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 2 * n; col++) {
                if ((row + col >= n) && (row >= col - n)) {
                    System.out.print(" #");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern B");
        for (int row = n - 1; row >= 0; row--) {
            for (int col = 0; col < 2 * n - 1; col++) {
                if ((row + col >= n) && (row >= col - n)) {
                    System.out.print(" #");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 2 * n; col++) {
                if ((row + col >= n) && (row >= col - n)) {
                    System.out.print(" #");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < 2 * n; col++) {
                if ((row + col >= n) && (row >= col - n)) {
                    System.out.print(" #");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= 2 * n - 1; column++) {
                if ((row + column <= n + 1) || (row <= column - n + 1)) {
                    System.out.print("#" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //PRINT LOWER PATTERN
        for (int row = n; row >= 1; row--) {
            if (row != n) {
                for (int column = 1; column <= 2 * n - 1; column++) {
                    if ((row + column <= n + 1) || (row <= column - n +1)) {
                        System.out.print("#" + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void testHillPattern(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        hillPatternX(size);
    }
}
