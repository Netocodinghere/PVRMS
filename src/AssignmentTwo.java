public class AssignmentTwo {

    public static void main(String[] args) throws Exception {
      AssignmentTwo assignmentTwo=new AssignmentTwo();
      
      System.out.println("----------------------------");
      System.out.println("PART 3");
      assignmentTwo.partThree();
      System.out.println("----------------------------");
      System.out.println("PART 4A");
      assignmentTwo.partFourA();

      System.out.println("----------------------------");
      System.out.println("PART 4B");
      assignmentTwo.partFourB();
      System.out.println("----------------------------");

     System.out.println("PART 5");
     assignmentTwo.partFive();
     System.out.println("----------------------------");

     System.out.println("PART 5");
     assignmentTwo.partSix();
     System.out.println("----------------------------");




      

    }

    public void partThree(){ 
    Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
    Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
    Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);

    Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
    Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
    Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
    Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);

    Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
    Ride ride1 = new Ride("Roller-Coaster", 20, employee1);

    ride1.addVisitorToQueue(visitor1);
    ride1.addVisitorToQueue(visitor2);
    ride1.addVisitorToQueue(visitor3);
    ride1.addVisitorToQueue(visitor4);
    ride1.addVisitorToQueue(visitor5);
    ride1.addVisitorToQueue(visitor6);
    ride1.addVisitorToQueue(visitor7);

    ride1.printQueue();
    ride1.removeVisitorFromQueue();
    ride1.printQueue();
}
    public void partFourA(){ 
     Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
    Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
    Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);

    Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
    Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
    Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
    Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);
    Visitor visitor8=new Visitor("Olivia", 29, "female", "Brisbane", 25);

    Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
    Ride ride = new Ride("Roller-Coaster", 20, employee1);

    ride.addVisitorToHistory(visitor7);
    ride.addVisitorToHistory(visitor6);
    ride.addVisitorToHistory(visitor5);
    ride.addVisitorToHistory(visitor4);
    ride.addVisitorToHistory(visitor3);
    ride.addVisitorToHistory(visitor2);
    ride.addVisitorToHistory(visitor1);

    ride.printRideHistory();
    System.out.println("**********************");
    System.out.println(ride.checkVisitorFromHistory(visitor8) ? "Visitor Found" : "Visitor Not Found");
        System.out.println(ride.checkVisitorFromHistory(visitor7) ? "Visitor Found" : "Visitor Not Found");

    System.out.println("               ");
    System.out.println("Number Of Visitors:" + ride.numberOfVisitors());
    System.out.println("               ");
    ride.printRideHistory();

  
  

    } 
    
    public void partFourB(){ 
    Visitor visitor1 = new Visitor("Andrew", 34, "male", "Brisbane", 10);
    Visitor visitor2 = new Visitor("Alice", 25, "female", "Sydney", 15);
    Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
    Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
    Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);

    Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
    Ride ride = new Ride("Roller-Coaster", 20, employee1);

    ride.addVisitorToHistory(visitor1);
    ride.addVisitorToHistory(visitor2);
    ride.addVisitorToHistory(visitor3);
    ride.addVisitorToHistory(visitor4);
    ride.addVisitorToHistory(visitor5);

    System.out.println("Visitors before sorting:");
    ride.printRideHistory();

    ride.sortRideHistory();

    System.out.println("Visitors after sorting:"); 
    ride.printRideHistory();
    }

    public void partFive(){ 
    // Create Visitors
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

    // Create Ride
    Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
    Ride ride = new Ride("Roller-Coaster", 5, employee1); // maxRider set to 5 for demonstration

    // Add Visitors to queue
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

    // Print all Visitors in the queue before running a cycle
    System.out.println("Visitors in queue before running a cycle:");
    ride.printQueue();

    // Run one cycle
    ride.runOneCycle();

    // Print all Visitors in the queue after running a cycle
    System.out.println("Visitors in queue after running a cycle:");
    ride.printQueue();

    // Print all Visitors in the collection (ride history)
    System.out.println("Visitors who have taken the ride (ride history):");
    ride.printRideHistory();
    }


    public void partSix(){ 
            Visitor visitor3 = new Visitor("Bob", 30, "male", "Melbourne", 20);
            Visitor visitor4 = new Visitor("Sophie", 28, "female", "Perth", 12);
            Visitor visitor5 = new Visitor("Michael", 40, "male", "Adelaide", 18);
            Visitor visitor6 = new Visitor("Emma", 22, "female", "Gold Coast", 8);
            Visitor visitor7 = new Visitor("Lucas", 35, "male", "Canberra", 14);
            Visitor visitor8 = new Visitor("Olivia", 29, "female", "Brisbane", 25);
            Employee employee1 = new Employee("James", 21, 300.99f, "Roller Manager", "male");
            Ride ride = new Ride("Roller-Coaster", 5, employee1);
            ride.addVisitorToQueue(visitor3);
            ride.addVisitorToQueue(visitor4);
            ride.addVisitorToQueue(visitor5);
            ride.addVisitorToQueue(visitor6);
            ride.addVisitorToQueue(visitor7);
            ride.addVisitorToQueue(visitor8);

            ride.runOneCycle();
            ride.exportRideHistoryToFile("ride_history");

     
            





    }

    public void partSeven(){ 

    }
}
