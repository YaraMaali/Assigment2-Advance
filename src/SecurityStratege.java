public class SecurityStratege implements EventStrategy {
    @Override
    public Event process(Event event) {
        System.out.println("[SECURITY] extra analysis for " + event.getId());
        return event;
    }
}
