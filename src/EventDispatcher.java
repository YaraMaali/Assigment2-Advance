import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {

    private final Map<Event.Type, EventProcessor> strategies = new HashMap<>();

    public EventDispatcher() {
        strategies.put(Event.Type.Email, new USER());
        strategies.put(Event.Type.Data_Processing, new SYSTEM());
        strategies.put(Event.Type.Report, new SECURITY());
    }

    public void dispatch(Event event) {
        EventProcessor processor = strategies.get(event.getType());
        processor.Processor(event);
    }
}
