package week11.abstractfactory.pseudocode;

import java.util.Scanner;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The OS you are using: Mac/Win");
        String os = sc.next();
        Application application;
        if (os.equals("Mac")) {
            application = new Application(new MacFactory());
        }
        else if (os.equals("Win")) {
            application = new Application(new WinFactory());
        }
        else {
            throw new IllegalArgumentException("Invalid OS type");
        }
        application.createUI();
        application.render();
    }
}
