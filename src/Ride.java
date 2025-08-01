import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

interface RideInterface{
    void addVisitorToQueue(Visitor visitor);
    
    Visitor removeVisitorFromQueue();
    
    Visitor[] printQueue();
   
    void runOneCycle();
   
    void addVisitorToHistory( Visitor visitor);
    
    boolean checkVisitorFromHistory(Visitor visitor);
   
    int numberOfVisitors();
  
    Visitor[] printRideHistory();
    
}

public class Ride implements RideInterface{
    
    public String type;
    public int maxRider;
    public boolean isOpened;
    private Employee operator;
    private Queue<Visitor> waitingQueue = new LinkedList<>();
    private  LinkedList<Visitor> rideHistory = new LinkedList<>();
    private int numOfCycles;

    Ride(){
        this.type = "";
        this.maxRider = 0;
        this.isOpened = false;
        this.operator = null;
    

    }

    Ride(String type, int maxRider, Employee operator){
        this.type = type;
        this.maxRider = maxRider;
        this.isOpened = true;
        this.operator = operator;

    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setMaxRider(int maxRider){
    if (maxRider < 1) {
        System.out.println("maxRider must be at least 1. Setting to 1.");
        this.maxRider = 1;
    } else {
        this.maxRider = maxRider;
    }
}

    public int getmaxRider(){
        return this.maxRider;
    }

        public void setOperator(Employee operator){
        this.operator = operator;
    }

    public Employee getOperator(){
        return this.operator;
    }

    public void setOpened(boolean isOpened){
        this.isOpened = isOpened;
    }


    public int getNumOfCycles(){
        return this.numOfCycles;
    }

    public boolean getOpened(){
        return this.isOpened;
    }


    @Override
    public void addVisitorToQueue(Visitor visitor) {
    if (visitor != null) {
        waitingQueue.add(visitor);
        System.out.println("Visitor added to the queue successfully.");
    } else {
        System.out.println("Failed to add visitor: Visitor is null.");
    }
}
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
    @Override
    public Visitor[] printQueue() {
    if (waitingQueue.isEmpty()) {
        System.out.println("The queue is empty.");
        return new Visitor[0];
    }
    System.out.println("Visitors in queue:");
    int i=1;
    for (Visitor v : waitingQueue) {
        System.out.println(i + ":" +" " + v.getName());
        i++; 
    }
    return waitingQueue.toArray(new Visitor[0]);
}

    @Override
    public void runOneCycle(){
        if (this.operator == null) {
            System.out.println("No Operator Assigned- Cycle Terminated!");
            return;
        }
        
        if (!waitingQueue.isEmpty()){
           int i=0;
           while(i < this.maxRider && !waitingQueue.isEmpty()){
             Visitor v=this.removeVisitorFromQueue();
             this.addVisitorToHistory(v);
             this.numOfCycles++;
             i++;

           }
           System.out.println("Cycle Completed!");
        }else if(waitingQueue.isEmpty()){
            System.out.println("No Visitor In Queue");

           }

    } 
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("Visitor added to ride history successfully.");

    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
     return this.rideHistory.contains(visitor);
}
    @Override
    public int numberOfVisitors() {
    return this.rideHistory.size();
}
    @Override
    public Visitor[] printRideHistory() {
    if (this.rideHistory.isEmpty()) {
        System.out.println("The ride history is empty.");
        return new Visitor[0];
    }
    System.out.println("Visitors in ride history:");
    int i = 1;
    for (Visitor v : rideHistory) {
        System.out.println(i + ": " + v.getName());
        i++;
    }
    return this.rideHistory.toArray(new Visitor[0]);
}
    public void sortRideHistory(){
        Collections.sort(this.rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted successfully.");
        System.out.println("Ride history sorted successfully.");
    }


}
