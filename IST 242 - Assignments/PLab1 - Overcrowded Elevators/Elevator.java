import java.util.ArrayList;

public class Elevator {
    private int weight_Limit;
    private int total_Weight;
    private ArrayList<Person> people = new ArrayList<>();


    public Elevator()                                           //No argument constructor sets both to 0
    {
        this.weight_Limit = 0;
        this.total_Weight = 0;
    }

    public Elevator(int weight_Limit, int total_Weight)         //Double argument constructor
    {
        this.weight_Limit = weight_Limit;
        this.total_Weight = total_Weight;
        this.people = new ArrayList<>();
    }


    public boolean addPerson(Person person)                     //If statement for adding people to elevator
    {
        if (person.getWeight() + total_Weight < weight_Limit)
        {
            total_Weight = total_Weight + person.getWeight();
            people.add(person);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setWeightLimit(int weight_Limit)                //Set for Weight Limit
    {
        this.weight_Limit = weight_Limit;
    }

    public void setTotalWeight(int total_Weight)                //Set for Total Weight
    {
        this.total_Weight = total_Weight;
    }

    public int getWeight_Limit()                                //Get Weight Limit
    {
        return this.weight_Limit;
    }

    public int getTotal_Weight()                                //Get Total Weight
    {
        return this.total_Weight;
    }

    public String getString()                                   //Using Enhanced for loop to create a return string
    {
        String information = "";
        for (Person p : people)
        {
            information += p.getInfo();
            information += "\n";
        }
        return information;
    }
}
