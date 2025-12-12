public class Logger implements ConsolLogger {
    @Override
    public void log(Event event) {
        System.out.println("[LOG] Processed event " + event.getId() + " type " + event.getType());
    }
}
