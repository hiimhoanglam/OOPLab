package week11.observer.uml;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new HexadecimalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
        System.out.println("-----------");
        subject.setState(10);
    }
}
