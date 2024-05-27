package week11.abstractfactory.example;


import java.util.Scanner;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of furniture you want: Victorian/Modern");
        String type = sc.next();
        type = type.toLowerCase();
        Application application;
        if (type.equals("victorian")) {
            application = new Application(new VictorianFurnitureFactory());
        }
        else if (type.equals("modern")) {
            application = new Application(new ModernFurnitureFactory());
        }
        else {
            throw new RuntimeException("Invalid type");
        }
        application.manufacture();
        application.work();
    }
}
