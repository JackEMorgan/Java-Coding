public class Student implements Gradable, Comparable<Student> {       //Tells us how to compare one student with another for sorting
    private String name;                                    //Automatically does this for us when using Strings, Ints, etc...
    private Double GPA;
    private Double quiz1;
    private Double quiz2;
    private int numAbsences;

    public Student(String name, double GPA)
    {
        this.name = name;
        this.GPA = GPA; 
    }

    @Override
    public double calculateGrade()
    {
        double grade = (quiz1 + quiz2) / 2;
        return grade;
    }

    @Override
    public int getAbsences()
    {
        return numAbsences;
    }


    @Override
    public String toString()                                //Allows us to return arrayLists more easily
    {
        return "\nName: " + name + "\nGPA: " + GPA;
    }

    @Override                               //This is behind the scenes for collection.sort
    public int compareTo(Student student)
    {
        //int compare = this.GPA.compareTo(student.GPA);    //Ascending Order
        //int compare = student.GPA.compareTo(this.GPA);    //Descending Order
        int compare = name.compareTo(student.name);    //We don't always need this keyword here... this would be infront of .name.compareTo
        return compare;
    }
}
