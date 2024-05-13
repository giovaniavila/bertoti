package mvc;

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