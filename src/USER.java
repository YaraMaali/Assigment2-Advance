public class USER implements EventProcessor{
    @Override
    public void Processor(Event event) {
        System.out.println("[USER] user-specific step for " + event.getId());
    }
}
