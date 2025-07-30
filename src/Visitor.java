public class Visitor extends Person{

    private String location;
    private float wallet;
    
    public Visitor(){
        this.wallet=0;
        this.location="";
        System.out.println("Visitor Instantiated");
    }

    public Visitor(String name, int age, String gender, String location, float wallet ){
        super(name, age, gender);
        this.wallet=wallet;
        this.location=location;


    }

    public void setWallet(int value){
        this.wallet=wallet;
    }
    
    public float getWallet(){
        return this.wallet;

    }

    public String getLocation(){
        return this.location;
    }

    public void setLocation(String loc){
        this.location=loc;
    }




}