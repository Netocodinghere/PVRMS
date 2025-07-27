public class Employee extends Person {
    private String role;
    private double salary;
    

    public Employee(){
        super();
        this.salary=0;
        this.role="";

     }

     public String getRole(){
        return role;
     }

     public void setRole(String role){
        this.role=role;
     }

     public double getSalary(){
        return salary;
     }

     public void setSalary(double salary){
        this.salary=salary;
     }

    
    public Employee(String name, int age, double salary, String role, String gender){
      super(name,age,gender);
      this.salary=salary;
      this.role=role;

    }


}
