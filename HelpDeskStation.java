package singletonPattern;

public class HelpDeskStation {
    private String stationName;
    private QueuingSystem queuingSystem;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
        // Get the single instance of the queuing system
        this.queuingSystem = QueuingSystem.getInstance();
    }

    public void serveNextCustomer() {
        queuingSystem.getNextQueueNumber();
        System.out.println(stationName + " is serving customer number: "
                + queuingSystem.getCurrentQueueNumber());
    }

    public void resetQueue(int newNumber) {
        System.out.println(stationName + " requested a queue reset.");
        queuingSystem.resetQueueNumber(newNumber);
    }
}
