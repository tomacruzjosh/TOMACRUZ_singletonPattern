package singletonPattern;

public class OnlineMonitoringSystem {

    public void displayCurrentNumber() {
        // Access the singleton instance to get real-time data
        QueuingSystem queuingSystem = QueuingSystem.getInstance();
        System.out.println("[Monitor] Current Queued Number: "
                + queuingSystem.getCurrentQueueNumber());
    }
}
