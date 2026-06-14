import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String videoTitle) {
        for (Observer observer : observers) {
            observer.update(videoTitle);
        }
    }
}
