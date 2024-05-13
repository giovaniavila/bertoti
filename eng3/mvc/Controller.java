package mvc;

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