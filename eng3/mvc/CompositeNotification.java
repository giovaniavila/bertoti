package mvc;

// Composite
class CompositeNotification implements Notification {
    private List<Notification> notifications = new ArrayList<>();

    public void add(Notification notification) {
        notifications.add(notification);
    }

    public void remove(Notification notification) {
        notifications.remove(notification);
    }

    public void notify() {
        for (Notification notification : notifications) {
            System.out.println("Composite notification: " + notification.getMessage());
        }
    }
}

// Classes auxiliares
class Event {
    private String description;

    public Event(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

interface Notification {
    String getMessage();
}

class SimpleNotification implements Notification {
    private String message;

    public SimpleNotification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}