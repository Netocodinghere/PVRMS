import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// Ride Interface it defines the basic contract for a ride
interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    Visitor removeVisitorFromQueue();
    Visitor[] printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    Visitor[] printRideHistory();
}

public class Ride implements RideInterface {

    public String type;         // Type of ride (e.g., Roller Coaster)
    public int maxRider;        // Maximum number of riders per cycle
    public boolean isOpened;    // Status of the ride (open(true) or closed(false))
    private Employee operator;  // Operator assigned to the ride
    private int numOfCycles;    // Number of cycles completed

    // Queues for waiting visitors and ride history
    private Queue<Visitor> waitingQueue = new LinkedList<>();
    private LinkedList<Visitor> rideHistory = new LinkedList<>();

    // Default constructor
    Ride() {
        this.type = "";
        this.maxRider = 0;
        this.isOpened = false;
        this.operator = null;
    }

    // Constructor with property assignment
    Ride(String type, int maxRider, Employee operator) {
        this.type = type;
        this.maxRider = maxRider;
        this.isOpened = true;
        this.operator = operator;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setMaxRider(int maxRider) {
        if (maxRider < 1) {
            System.out.println("maxRider must be at least 1. Setting to 1.");
            this.maxRider = 1;
        } else {
            this.maxRider = maxRider;
        }
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    // Getters
    public Employee getOperator() {
        return this.operator;
    }

    public int getNumOfCycles() {
        return this.numOfCycles;
    }

    public boolean getOpened() {
        return this.isOpened;
    }

    public int getMaxRider() {
        return this.maxRider;
    }

    public String getType() {
        return this.type;
    }

    // Add a visitor to the waiting queue
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            waitingQueue.add(visitor);
            System.out.println("Visitor added to the queue successfully.");
        } else {
            System.out.println("Failed to add visitor: Visitor is null.");
        }
    }

    // Remove the first visitor from the queue
    @Override
    public Visitor removeVisitorFromQueue() {
        if (!waitingQueue.isEmpty()) {
            Visitor removed = waitingQueue.poll();
            System.out.println("Visitor " + removed.getName() + " removed from the queue.");
            return removed;
        } else {
            System.out.println("Queue is empty. No visitor to remove.");
            return null;
        }
    }

    // Print all visitors in the queue
    @Override
    public Visitor[] printQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("The queue is empty.");
            return new Visitor[0];
        }

        System.out.println("Visitors in queue:");
        int i = 1;
        for (Visitor v : waitingQueue) {
            System.out.println(i + ": " + v.getName());
            i++;
        }
        return waitingQueue.toArray(new Visitor[0]);
    }

    // Run one ride cycle
    @Override
    public void runOneCycle() {
        // Check if operator is assigned
        if (this.operator == null) {
            System.out.println("No Operator Assigned - Cycle Terminated!");
            return;
        }

        // Check if ride is open
        if (!this.isOpened) {
            System.out.println("This Ride Is Not Opened Yet!");
            return;
        }

        // Check if there are visitors in the queue
        if (!waitingQueue.isEmpty()) {
            int i = 0;

            // Load visitors up to maxRider capacity
            while (i < this.maxRider && !waitingQueue.isEmpty()) {
                Visitor v = this.removeVisitorFromQueue();
                this.addVisitorToHistory(v);
                i++;
            }

            this.numOfCycles++;
            System.out.println("Cycle Completed!");
        } else {
            System.out.println("No Visitor In Queue");
        }
    }

    // Add visitor to ride history
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("Visitor added to ride history successfully.");
    }

    // Check if visitor has been on the ride before
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return this.rideHistory.contains(visitor);
    }

    // Get the number of visitors in history
    @Override
    public int numberOfVisitors() {
        return this.rideHistory.size();
    }

    // Print the ride history
    @Override
    public Visitor[] printRideHistory() {
        if (this.rideHistory.isEmpty()) {
            System.out.println("The ride history is empty.");
            return new Visitor[0];
        }

        System.out.println("Visitors in ride history:");
        int i = 1;
        for (Visitor v : rideHistory) {
            System.out.println(i + ": " + v.toString());
            i++;
        }
        return this.rideHistory.toArray(new Visitor[0]);
    }

    // Sort ride history by a defined comparator
    public void sortRideHistory() {
        Collections.sort(this.rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted successfully.");
    }

    // Export ride history to CSV file
    public void exportRideHistoryToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename + ".csv")) {
            for (Visitor v : this.rideHistory) {
                writer.write(v.toString() + "\n");
            }
            System.out.println("Ride history exported to " + filename + ".csv");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Import ride history from CSV file
    public void importRideHistoryFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename + ".csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Visitor visitor = new Visitor(
                    parts[0],
                    Integer.parseInt(parts[1]),
                    parts[2],
                    parts[3],
                    Float.parseFloat(parts[4])
                );
                this.addVisitorToHistory(visitor);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
