import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

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

public class Ride{
    
    public String type;
    public int capacity;
    public boolean isOpened;
    private Employee operator;
    private ArrayList<Visitor> riders;
    private Queue<Visitor> waitingQueue = new LinkedList<>();
    
    Ride(){
        this.type = "";
        this.capacity = 0;
        this.isOpened = false;
        this.operator = null;
        this.riders = null;
    

    }

    Ride(String type, int capacity, Employee operator, ArrayList<Visitor> riders ){
        this.type = type;
        this.capacity = capacity;
        this.isOpened = true;
        this.operator = operator;
        this.riders = riders;
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

    public void setRiders(ArrayList<Visitor> riders){
        this.riders = riders;
    }

    public ArrayList<Visitor> getRiders(){
        return this.riders;
    }

    public void setOpened(boolean isOpened){
        this.isOpened = isOpened;
    }

    public boolean getOpened(){
        return this.isOpened;
    }

    public void addNewRider(Visitor rider){
          this.riders.add(rider);
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
        System.out.println("Visitor " + removed + " removed from the queue.");
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
    for (Visitor v : waitingQueue) {
        System.out.println(v); // Assumes Visitor has a useful toString method
    }
    return waitingQueue.toArray(new Visitor[0]);
}


}
