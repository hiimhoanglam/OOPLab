package week11.observer.uml;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Update to Octal String" + Integer.toOctalString(subject.getState()));
    }
}
