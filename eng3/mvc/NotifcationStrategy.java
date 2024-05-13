package mvc;

// Strategy
interface NotificationStrategy {
    void notify(String message);
}

class EmailNotificationStrategy implements NotificationStrategy {
    public void notify(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

class SMSNotificationStrategy implements NotificationStrategy {
    public void notify(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
