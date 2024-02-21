package week1.ex21;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        checkPass(mark);
    }
    public static void checkPass(int mark) {
        System.out.println("The mark is " + mark);

        if (mark >= 50) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
