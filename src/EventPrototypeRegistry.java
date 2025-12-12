import java.util.HashMap;
import java.util.Map;

public class EventPrototypeRegistry {

    private static final Map<Event.Type, Eventprototype> prototypes = new HashMap<>();

    static {
        prototypes.put(Event.Type.Email, new UserPrototype());
        prototypes.put(Event.Type.Data_Processing, new SystemPrototype());
        prototypes.put(Event.Type.Report, new SecurityPrototype());
    }

    public static Event create(Event.Type type) {
        return prototypes.get(type).clone();
    }
}
