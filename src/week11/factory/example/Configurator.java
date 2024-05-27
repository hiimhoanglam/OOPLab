package week11.factory.example;

import java.util.Scanner;

public class Configurator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your OS");
        String os = sc.next();
        Application application = new Application(os);
        application.render();
    }
}
