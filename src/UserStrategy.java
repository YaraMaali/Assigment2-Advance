public class UserStrategy implements EventStrategy {
    @Override
    public Event process(Event event) {
        System.out.println("[USER] user-specific step for " + event.getId());
        return event;
    }
}
