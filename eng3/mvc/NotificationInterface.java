package mvc;

import javax.management.Notification;

public interface NotificationInterface {
    void addNotification(Notification notification);
    void notifyObservers();
}
