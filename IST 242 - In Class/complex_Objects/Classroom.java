import java.util.ArrayList;

public class Classroom {
    private String name;
    private ArrayList<Student> students;

    public Classroom(String name, ArrayList<Student> students) 
    {
        this.name = name;
        this.students = students;
    }

    public String getInfo() 
    {
        String retVal = "";

        retVal = retVal + "Classroom name: " + this.name + "\n";        //Can also use += as done in elevator

        for(Student s: students)
        {
            retVal += "\n" + s.getInfo();
        }

        return retVal;
    }
}
