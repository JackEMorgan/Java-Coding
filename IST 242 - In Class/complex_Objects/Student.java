public class Student {
    private String name;
    private double GPA;
    private Address address;
    // private String addressLine1;             //Instead of listing all of these variables,
    // private String addressLine2;             //We create a new Address class that references the student.
    // private String city;                     //Student HAS-A address
    // private String state;                    //Student IS-A person (inherits), Having GPA differentiates student from faculty
    // private String ZIP;                      //Can combine relationships Student -> is-a Person and Student -> has-a address


    public Student(String name, double GPA) 
    {
        this.name = name;
        this.GPA = GPA;
    }

    public String getInfo() 
    {
        return "Name: " + this.name + ", GPA: " + this.GPA; 
    }
    

}
