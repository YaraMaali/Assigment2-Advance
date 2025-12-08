public class EventDispatcher {
    private EventProcessor userProcessor = new USER();
    private EventProcessor systemProcessor = new SYSTEM();
    private EventProcessor securityProcessor = new SECURITY();

    public void dispatch(Event event) {

        switch (event.getType()) {
            case Email:
                userProcessor.Processor(event);
                break;

            case Data_Processing:
                systemProcessor.Processor(event);
                break;

            case Report:
                securityProcessor.Processor(event);
                break;
        }
    }

}
