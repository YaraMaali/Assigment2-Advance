public class SYSTEM implements EventProcessor{
    @Override
    public void Processor(Event event) {
        new SystemStrategy().process(event);}
}
