public class Dashboard implements ConsolDashboard {
    @Override
    public void updateMetrics(Event e) {
        System.out.println(String.format("[Dashboard] metrics updated for %s, payload: %s", e.getId() , e.getPayload()));
    }
}
