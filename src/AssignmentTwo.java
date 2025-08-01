public class AssignmentTwo {
    public static void main(String[] args) throws Exception {
      AssignmentTwo assignmentTwo=new AssignmentTwo();
      assignmentTwo.partThree();

    }

    public void partThree(){ 
        Visitor visitor1=new Visitor("Andrew", 34, "male", "Brisbane",10);
        Employee employee1=new Employee("James", 21,300.99f,"Roller Manager", "male ");
        Ride ride1=new Ride("Roller-Coaster", 20, employee1);

        ride1.addVisitorToQueue(visitor1);
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
