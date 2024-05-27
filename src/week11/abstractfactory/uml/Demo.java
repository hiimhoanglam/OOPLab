package week11.abstractfactory.uml;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is your shape round? Y/n");
        String answer = sc.next();
        boolean rounded;
        rounded = answer.equalsIgnoreCase("Y");
        System.out.println("What shape do you want: Square/Rectangle");
        answer = sc.next();
        FactoryProducer factoryProducer = new FactoryProducer(rounded);
        factoryProducer.createShape(answer);
        factoryProducer.draw();
    }
}
