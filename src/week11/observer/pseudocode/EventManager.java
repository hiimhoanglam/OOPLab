package week11.observer.pseudocode;

import java.util.ArrayList;
import java.util.List;
public class EventManager {
    private List<EventListeners> listenersList = new ArrayList<>();
    public void subscribe(EventListeners listeners) {
        if (listeners != null) {
            listenersList.add(listeners);
        }
    }
    public void unsubscribe(EventListeners listeners) {
        if (listeners != null) {
            listenersList.add(listeners);
        }
    }
    public void notify(String eventType, String data) {
        for (EventListeners eventListeners: listenersList) {
           eventListeners.update(data);
        }

    }
}
