package singletonPattern;

public class QueuingSystem {
    // The single instance of the class
    private static QueuingSystem instance;

    // The state: current queue number
    private int currentQueueNumber;

    // Private constructor prevents instantiation from other classes
    private QueuingSystem() {
        // Initialize queue number to 0
        currentQueueNumber = 0;
    }

    // Public method to get the single instance (Global Access Point)
    public static synchronized QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    // Get the current number (for monitoring)
    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    // Generate the next number (for help desks serving customers)
    public synchronized void getNextQueueNumber() {
        currentQueueNumber++;
    }

    // Reset the queue number (for specific situations)
    public synchronized void resetQueueNumber(int newNumber) {
        if (newNumber >= 0) {
            currentQueueNumber = newNumber;
            System.out.println("--- Queue System Reset to number: " + newNumber + " ---");
        }
    }
}
