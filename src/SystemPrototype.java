public class SystemPrototype implements Eventprototype {
    @Override
    public Event clone() {
        return new Event("System_EVENT", Event.Type.Data_Processing);
    }
}
