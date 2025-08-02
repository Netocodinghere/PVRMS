import java.util.LinkedList;
import java.util.Queue;
import java.util.Comparator;
import java.lang.Integer;

public class VisitorComparator implements  Comparator<Visitor>{

    public int compare(Visitor v1, Visitor v2) {
        int ageCompare=Integer.compare(v1.getAge(), v2.getAge());
        if(ageCompare!=0){
            return ageCompare;
        }
        return v1.getName().compareTo(v2.getName());

    }



}

interface RideInterface{
    void addVisitorToQueue(Visitor visitor);
    
    void removeVisitorFromQueue();
    
    Visitor[] printQueue();
   
    void runOneCycle();
   
    void addVisitorToHistory( Visitor visitor);
    
    boolean checkVisitorFromHistory(Visitor visitor);
   
    int numberOfVisitors();
  
    Visitor[] printRideHistory();
    
}

public class Ride implements RideInterface{
    
    public String type;
    public int capacity;
    public boolean isOpened;
    private Employee operator;
    private Queue<Visitor> waitingQueue = new LinkedList<>();
    private  LinkedList<Visitor> rideHistory = new LinkedList<>();
    
    Ride(){
        this.type = "";
        this.capacity = 0;
        this.isOpened = false;
        this.operator = null;
    

    }

    Ride(String type, int capacity, Employee operator){
        this.type = type;
        this.capacity = capacity;
        this.isOpened = true;
        this.operator = operator;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
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
    @Override
    public void removeVisitorFromQueue() {
    if (!waitingQueue.isEmpty()) {
        Visitor removed = waitingQueue.poll();
        System.out.println("Visitor " + removed.getName() + " removed from the queue.");
    } else {
        System.out.println("Queue is empty. No visitor to remove.");
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


}
