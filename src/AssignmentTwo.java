public class AssignmentTwo {

    public static void main(String[] args) throws Exception {
        AssignmentTwo assignmentTwo = new AssignmentTwo();

        System.out.println("----------------------------");
        System.out.println("PART 3");
        System.out.println("----------------------------");
        assignmentTwo.partThree();
        System.out.println();

        System.out.println("----------------------------");
        System.out.println("PART 4A");
        System.out.println("----------------------------");
        assignmentTwo.partFourA();
        System.out.println();

        System.out.println("----------------------------");
        System.out.println("PART 4B");
        System.out.println("----------------------------");
        assignmentTwo.partFourB();
        System.out.println();

        System.out.println("----------------------------");
        System.out.println("PART 5");
        System.out.println("----------------------------");
        assignmentTwo.partFive();
        System.out.println();

        System.out.println("----------------------------");
        System.out.println("PART 6");
        System.out.println("----------------------------");
        assignmentTwo.partSix();
        System.out.println();

        System.out.println("----------------------------");
        System.out.println("PART 7");
        System.out.println("----------------------------");
        assignmentTwo.partSeven();
    }

    // --------------------------------
    // PART 3: Add Visitors to Queue, Remove One, and Print
    // --------------------------------
    public void partThree() {
        Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
        Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
        Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
        Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
        Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
        Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
        Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);

        Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
        Ride ride1 = new Ride("Roller-Coaster", 20, employee1);

        // Add all visitors to the queue
        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);
        ride1.addVisitorToQueue(visitor6);
        ride1.addVisitorToQueue(visitor7);

        System.out.println();
        ride1.printQueue(); // Print queue before removal

        System.out.println();
        ride1.removeVisitorFromQueue(); // Remove first visitor

        System.out.println();
        ride1.printQueue(); // Print queue after removal
    }

    // --------------------------------
    // PART 4A: Add Visitors to History, Check Existence, Count, Print
    // --------------------------------
    public void partFourA() {
        Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
        Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
        Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
        Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
        Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
        Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
        Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);
        Visitor visitor8 = new Visitor("Olivia", 29, "female", "Brisbane", 25);

        Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
        Ride ride = new Ride("Roller-Coaster", 20, employee1);

        // Add visitors to ride history
        ride.addVisitorToHistory(visitor7);
        ride.addVisitorToHistory(visitor6);
        ride.addVisitorToHistory(visitor5);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor1);

        System.out.println();
        ride.printRideHistory();

        // Check if specific visitors are in history
        System.out.println();
        System.out.println(ride.checkVisitorFromHistory(visitor8)
                ? visitor8.getName() + " Found"
                : visitor8.getName() + " Not Found");

        System.out.println(ride.checkVisitorFromHistory(visitor7)
                ? visitor7.getName() + " Found"
                : visitor7.getName() + " Not Found");

        // Print total number of visitors
        System.out.println();
        System.out.println("Number Of Visitors: " + ride.numberOfVisitors());

        System.out.println();
        ride.printRideHistory();
    }

    // --------------------------------
    // PART 4B: Sort Ride History by Name
    // --------------------------------
    public void partFourB() {
        Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
        Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
        Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
        Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
        Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);

        Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
        Ride ride = new Ride("Roller-Coaster", 20, employee1);

        // Add visitors to ride history
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        System.out.println("\nVisitors before sorting:");
        ride.printRideHistory();

        ride.sortRideHistory(); // Sort history alphabetically

        System.out.println("\nVisitors after sorting:");
        ride.printRideHistory();
    }

    // --------------------------------
    // PART 5: Run a Ride Cycle with Limited Capacity
    // --------------------------------
    public void partFive() {
        // Create visitors
        Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
        Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
        Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
        Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
        Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
        Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
        Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);
        Visitor visitor8 = new Visitor("Olivia", 29, "female", "Brisbane", 25);
        Visitor visitor9 = new Visitor("Ethan", 27, "male", "Darwin", 11);
        Visitor visitor10 = new Visitor("Grace", 31, "female", "Hobart", 17);

        Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
        Ride ride = new Ride("Roller-Coaster", 5, employee1); // capacity = 5

        // Add all visitors to queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        System.out.println("\n---------- Visitors in queue before running a cycle ----------");
        ride.printQueue();

        ride.runOneCycle(); // Run one ride cycle

        System.out.println("\n------- Visitors in queue after running a cycle -------");
        ride.printQueue();

        System.out.println("\n------- Visitors who have taken the ride (ride history) -------");
        ride.printRideHistory();
    }

    // --------------------------------
    // PART 6: Export Ride History to File
    // --------------------------------
    public void partSix() {
        Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
        Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
        Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
        Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
        Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);
        Visitor visitor8 = new Visitor("Olivia", 29, "female", "Brisbane", 25);

        Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
        Ride ride = new Ride("Roller-Coaster", 5, employee1);

        // Add visitors to queue
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);

        ride.runOneCycle(); // Run a cycle
        ride.exportRideHistoryToFile("ride_history"); // Export to file
    }

    // --------------------------------
    // PART 7: Import Ride History from File
    // --------------------------------
    public void partSeven() {
        Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
        Ride ride = new Ride("Roller-Coaster", 5, employee1);

        ride.importRideHistoryFromFile("ride_history"); // Import from file
        System.out.println();
        ride.printRideHistory();
    }
}
