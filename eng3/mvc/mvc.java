package mvc;

import java.util.ArrayList;
import java.util.List;

// Model
class Model {
    private List<Event> events = new ArrayList<>();
    private List<Notification> notifications = new ArrayList<>();
    private List<View> views = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
        notifyObservers();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
        notifyObservers();
    }

    public void registerView(View view) {
        views.add(view);
    }

    private void notifyObservers() {
        for (View view : views) {
            view.update(events, notifications);
        }
    }
}

// View
interface View {
    void update(List<Event> events, List<Notification> notifications);
}

class ConsoleView implements View {
    public void update(List<Event> events, List<Notification> notifications) {
        System.out.println("Events:");
        for (Event event : events) {
            System.out.println("- " + event.getDescription());
        }

        System.out.println("Notifications:");
        for (Notification notification : notifications) {
            System.out.println("- " + notification.getMessage());
        }
    }
}

// Controller
class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void addEvent(Event event) {
        model.addEvent(event);
    }

    public void addNotification(Notification notification) {
        model.addNotification(notification);
    }
}

// Observer
interface Observer {
    void update();
}

class NotificationObserver implements Observer {
    private Model model;

    public NotificationObserver(Model model) {
        this.model = model;
        model.registerView(new ConsoleView());
    }

    public void update() {
        System.out.println("New notification received!");
    }
}

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

// Exemplo de uso
public class mvc {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        NotificationObserver observer = new NotificationObserver(model);

        controller.addEvent(new Event("Meeting at 3pm"));
        controller.addNotification(new SimpleNotification("Don't forget to call John"));
        controller.addNotification(new CompositeNotification() {{
            add(new SimpleNotification("Buy milk"));
            add(new SimpleNotification("Send report"));
        }});
    }
}
