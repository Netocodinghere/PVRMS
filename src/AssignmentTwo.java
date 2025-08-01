public class AssignmentTwo {
    public static void main(String[] args) throws Exception {
      AssignmentTwo assignmentTwo=new AssignmentTwo();
      assignmentTwo.partThree();

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

    } 
    public void partFourB(){ 

    } 
    public void partFive(){ 

    } 
    public void partSix(){ 

    } 
    public void partSeven(){ 

    }
}
