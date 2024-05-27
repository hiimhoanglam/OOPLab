package week11.observer.uml;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        super(subject);
    }
    @Override
    public void update() {
        System.out.println("Update to binary string: " + Integer.toBinaryString(subject.getState()));
    }
}
