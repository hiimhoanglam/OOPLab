package week10.observer.uml;
import java.util.List;
import java.util.ArrayList;
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }
    public void removeObserver(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }
    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
