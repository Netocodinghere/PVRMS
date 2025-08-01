abstract class Person {
    private String name;
    private int age;
    private  String gender;

    public Person(){
        this.name="";
        this.age=0;
        this.gender="";
    }


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }


    public void setGender(String gender){
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
