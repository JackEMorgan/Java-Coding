import java.util.ArrayList;

public class Student {
    private String name;                                    //Private specifies that variable is only accessible inside this class
    private double GPA;                                     //Encapsulation: Control over how attributes are accessed. 
    private String major;
    private ArrayList<String> pets; // = new ArrayList(); Each student has the capability to manage an ArrayList<String> pets

    
    public Student(String name, double GPA, String major)   //Has same name as our class* automatically gets called
    {
        this.name = name;                                   //Notice how method is not static. Associated with an instance of that class
        this.GPA = GPA;
        this.major = major;
        this.pets = new ArrayList();
    }


    public Student(String name)                             //1 Argument Constructor
    {
        this.name = name;
        this.GPA = -1;
        this.major = "Undeclared";
        this.pets = new ArrayList();
    }

    public Student()                                        //0 Argument Constructor
    {
        this.name = "N/A";
        this.GPA = -1;
        this.major = "Undeclared";
        this.pets = new ArrayList();
    }

    public void addPet(String petName)                      //Similar to a setter, but for an arrayList its an adder
    {
        pets.add(petName);
    }

    public ArrayList<String> getPets()
    {
        return this.pets; //Don't need this.arrayList name but it's consistency
    }



    public void setGPA(double GPA)                          //Setter vs Getter
    {
        this.GPA = GPA;
    }


    public void setMajor(String major)
    {
        this.major = major;
    }


    public double getGPA()
    {
        return this.GPA;
    }

    public String getMajor()
    {
        return this.major;
    }


    public String getInfo()                                 //Retrieving Information/Variables
    {
        return "Name: " + this.name + "\n GPA: " + this.GPA + "\n Major: " + this.major;
    }
}