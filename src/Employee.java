public class Employee extends Person {

    private String role;   // Job role/title of the employee
    private float salary;  // Salary of the employee

    // Default constructor
    public Employee() {
        super();
        this.salary = 0;
        this.role = "";
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Setter for role
    public void setRole(String role) {
        this.role = role;
    }

    // Getter for salary
    public float getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Parameterized constructor
    public Employee(String name, int age, float salary, String role, String gender) {
        super(name, age, gender); 
        this.salary = salary;
        this.role = role;
    }
}
