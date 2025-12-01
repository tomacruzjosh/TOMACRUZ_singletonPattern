package singletonPattern;

public class PagIbigOfficeApp {
    public static void main(String[] args) {
        System.out.println("=== Centralized Queuing System Startup ===\n");

        // Instantiate the Help Desk Stations
        HelpDeskStation station1 = new HelpDeskStation("Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Station 3");

        // Instantiate the Online Monitor
        OnlineMonitoringSystem monitor = new OnlineMonitoringSystem();

        // Workflow simulation

        // 1. Station 1 serves the first customer
        station1.serveNextCustomer();
        monitor.displayCurrentNumber();

        // 2. Station 2 serves the next
        station2.serveNextCustomer();
        monitor.displayCurrentNumber();

        // 3. Station 3 serves the next
        station3.serveNextCustomer();
        monitor.displayCurrentNumber();

        // 4. Station 1 serves again (Notice the number continues incrementing centrally)
        station1.serveNextCustomer();
        monitor.displayCurrentNumber();

        System.out.println("\n*** Technical Issue occurred - Resetting Queue ***\n");

        // 5. Resetting the queue via a station (e.g., reset to 0 or a specific number)
        station2.resetQueue(0);
        monitor.displayCurrentNumber();

        // 6. Resume serving
        station3.serveNextCustomer();
        monitor.displayCurrentNumber();
    }
}
