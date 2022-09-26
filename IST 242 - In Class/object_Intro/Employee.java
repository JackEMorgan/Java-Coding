public class Employee {
    private String name;
    private int age;
    private int salary;
    private String job_Title;

    public Employee(String name, int age, int salary, String job_Title) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job_Title = job_Title;
    }


    public String getInfo() 
    {
        return "Name: " + this.name + "\n Age: " + this.age + "\n Salary: " + this.salary + "\n job_Title: " + this.job_Title;
    }
}