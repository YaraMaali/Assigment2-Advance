public class Event implements Cloneable {

    public enum Type {
        Email,
        Data_Processing,
        Report
    }

    private String id;
    private Type type;

    public Event(String id, Type type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    @Override
    public Event clone() {
        return new Event(this.id, this.type);
    }
}
