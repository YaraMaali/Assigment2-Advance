public class Database implements ConsolDatabase {
    @Override
    public void save(String id, String data) {
        System.out.println("[DB] Saved " + id + ":" + data);
    }
}
