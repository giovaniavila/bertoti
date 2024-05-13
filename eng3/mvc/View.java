package mvc;

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