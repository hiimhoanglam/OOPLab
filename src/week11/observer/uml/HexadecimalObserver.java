package week11.observer.uml;

public class HexadecimalObserver extends Observer{

    public HexadecimalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Update to hex string: " + Integer.toHexString(subject.getState()));
    }
}
