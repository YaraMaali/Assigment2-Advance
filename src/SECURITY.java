public class SECURITY implements EventProcessor {
    @Override
    public void Processor(Event event) {
        new SecurityStratege().process(event);}
}
