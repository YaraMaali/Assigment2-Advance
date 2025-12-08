public class Main {

    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();

        // Event 1
        Event e1 = new Event(Event.Type.Email, "user-click");
        e1.setId("E1");
        e1.setEncrypt(true);
        e1.setAddMetadata(true);
        e1.setMetadata("u=42");
        dispatcher.dispatch(e1);
        Event e2 = new Event(Event.Type.Report, "failed-login");
        e2.setId("E2");
        e2.setCompress(true);
        dispatcher.dispatch(e2);

        Event e3 = new Event(Event.Type.Data_Processing, "daily-backup");
        e3.setId("E3");
        dispatcher.dispatch(e3);

    }
}
