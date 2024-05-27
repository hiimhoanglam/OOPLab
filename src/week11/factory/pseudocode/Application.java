package week11.factory.pseudocode;

import java.util.Scanner;

public class Application {
    static Dialog dialog;
    public static void initialize(Scanner sc) {
        System.out.println("Enter your OS");
        String os = sc.next();
        if (os.equals("Windows")) {
            dialog = new WindowsDialog();
        }
        else if (os.equals("Web")) {
            dialog = new WebDialog();
        }
        else {
            throw new RuntimeException("Invalid os");
        }
    }
    public static void display() {
        dialog.render();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initialize(sc);
        display();
    }
}
