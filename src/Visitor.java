public class Visitor extends Person {

    private String location; // Visitor's location
    private float wallet;    // Amount of money in visitor's wallet

    // Default constructor
    public Visitor() {
        this.wallet = 0;
        this.location = "";
        System.out.println("Visitor Instantiated");
    }

    // Constructor with all properties
    public Visitor(String name, int age, String gender, String location, float wallet) {
        super(name, age, gender); // Call Person constructor
        this.wallet = wallet;
        this.location = location;
    }

    // Setter for wallet amount
    public void setWallet(float value) { // Changed int → float for consistency
        this.wallet = value; // FIXED: was assigning wallet to itself
    }

    // Getter for wallet amount
    public float getWallet() {
        return this.wallet;
    }

    // Getter for location
    public String getLocation() {
        return this.location;
    }

    // Setter for location
    public void setLocation(String loc) {
        this.location = loc;
    }

    // Override toString to provide CSV-style output
    @Override
    public String toString() {
        return super.getName() + "," +
               super.getAge() + "," +
               super.getGender() + "," +
               this.location + "," +
               this.wallet;
    }
}
