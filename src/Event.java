public class Event {
    private Type type;
    private String payload;
    private boolean encrypt;
    private boolean compress;
    private boolean addMetadata;
    private String metadata;
    private String id;
    public Event(Type type, String payload) {
        this.type = type; this.payload = payload;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }
    public boolean isEncrypt() {
        return encrypt;
    }
    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }
    public boolean isCompress() {
        return compress;
    }
    public void setCompress(boolean compress) {
        this.compress = compress;
    }
    public boolean isAddMetadata() {
        return addMetadata;
    }
    public void setAddMetadata(boolean addMetadata) {
        this.addMetadata = addMetadata;
    }
    public String getMetadata() {
        return metadata;
    }
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public enum Type {
        Email, Data_Processing, Report;
    }
}