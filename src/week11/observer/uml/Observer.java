package week11.observer.uml;

public abstract class Observer {
    Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public abstract void update();
}
