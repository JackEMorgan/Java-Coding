public class Person {
    private String name;
    private int weight;
    
    public Person(String name, int weight) {                //Double constructor 
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name)                        //Setter for person name
    {
        this.name = name;
    }

    public void setWeight(int weight)                       //Setter for person weight
    {
        this.weight = weight;
    }

    public String getName()                                 //Getter for person name
    {
        return this.name;
    }

    public int getWeight()                                  //Getter for person weight
    {
        return this.weight;
    }

    public String getInfo()                                 //Returns name and weight (all info)
    {
        return "Name: " + name + "\n" + "Weight: " + weight;
    }

}

