package week10.observer.uml;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
