package week10.strategy.pseudocode;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String action = sc.next();
        Context context = new Context();
        switch (action) {
            case "+" -> context.setStrategy(new AddStrategy());
            case "-" -> context.setStrategy(new SubtractStrategy());
            case "*" -> context.setStrategy(new MultiplicationStrategy());
            case "/" -> context.setStrategy(new DivideStrategy());
            case "bit" -> context.setStrategy(new BitwiseStrategy());
            default -> throw new RuntimeException("Invalid action");
        }
        System.out.println(context.executeStrategy(a, b));
    }
}
