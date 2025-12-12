public class SystemStrategy implements EventStrategy {
    @Override
    public Event process(Event event) {
        System.out.println("[SYSTEM] system audit log " + event.getId());
        return event;
    }
}
