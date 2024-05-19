package mvc;

import java.util.ArrayList;
import java.util.List;

import javax.management.Notification;

public class Model implements NotificationInterface {
    private List<Observer> observers = new ArrayList<>();
    private List<String> notifications = new ArrayList<>();

    @Override
    public void addNotification(Notification notification) {
        notifications.add(notification.getMessage());
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notifications.get(notifications.size() - 1));
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}

