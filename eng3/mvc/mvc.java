package mvc;

import java.util.ArrayList;
import java.util.List;



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
