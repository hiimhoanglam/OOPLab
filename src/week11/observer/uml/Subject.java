package week11.observer.uml;
import java.util.List;
import java.util.ArrayList;
public class Subject {
    List<Observer> observers = new ArrayList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }
    public void attach(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }
    public void notifyAllObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
