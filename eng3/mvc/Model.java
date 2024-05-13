package mvc;

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
