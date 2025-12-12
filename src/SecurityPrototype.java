public class SecurityPrototype implements Eventprototype {
    @Override
    public Event clone() {
        return new Event("Security_EVENT", Event.Type.Report);
    }
}
