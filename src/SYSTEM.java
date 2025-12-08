public class SYSTEM implements EventProcessor{
    @Override
    public void Processor(Event event) {
        System.out.println("[SYSTEM] system audit log " + event.getId());
    }
}
