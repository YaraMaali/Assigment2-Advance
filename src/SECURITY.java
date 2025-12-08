public class SECURITY implements EventProcessor{
    @Override
    public void Processor(Event event) {
        System.out.println("[SECURITY] extra analysis for " + event.getId());
        System.out.println("[SecurityMonitor] alert for " + event.getId());
    }
}
