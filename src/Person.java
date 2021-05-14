public class Person {
    
    private String firstName;
    private String lastName;
    private int age;

    //Default Contractors
    public Person(){
        setFirstName("Default text");
        setLastName("Default text");
        setAge(0);
    }
    //Parameterized constructor
    public Person(String firstName,String lastName, int age){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }
    //Getters:
    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    //Setters:
    public void setAge(int age) {
        this.age = age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Override
    public String toString() {
        return (getFirstName() + " " + getLastName() + ", Age: " + getAge());
    }

}
