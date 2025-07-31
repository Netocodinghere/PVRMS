import java.util.ArrayList;

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

    


}
