public class UserPrototype implements Eventprototype {
    @Override
    public Event clone() {
        return new Event("USER_EVENT", Event.Type.Email);
    }
}
