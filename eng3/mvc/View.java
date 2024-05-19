package mvc;

public class View implements Observer {
    private Model model;
    private ControllerInterface controller;

    public View(Model model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        model.addObserver(this);
    }

    public void createView() {
        // Código para criar a interface gráfica
    }

    @Override
    public void update(String notification) {
        display(notification);
    }

    public void display(String notification) {
        System.out.println("Notification: " + notification);
    }
}
