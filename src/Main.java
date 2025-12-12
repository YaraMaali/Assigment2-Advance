public class Main {
    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();

        Event userEvent = EventPrototypeRegistry.create(Event.Type.Email);
        Event systemEvent = EventPrototypeRegistry.create(Event.Type.Data_Processing);
        Event securityEvent = EventPrototypeRegistry.create(Event.Type.Report);

        dispatcher.dispatch(userEvent);
        dispatcher.dispatch(systemEvent);
        dispatcher.dispatch(securityEvent);
    }
}

