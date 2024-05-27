package week10.observer.uml;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecimal String: " + Integer.toHexString(subject.getState()));
    }
}
