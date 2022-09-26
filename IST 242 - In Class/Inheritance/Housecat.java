public class Housecat extends Animal {          //extends denotes that we are inheriting all attributes/methods from Animal.java
    private double litterBoxSize;               //Specify all attributes that **differentiate** housecat from an animal
    private boolean meowsLoudly;

    public Housecat(double weight, String species, int age, double litterBoxSize, boolean meowsLoudly) 
    {
        super(weight, species, age);            //Super keyword calls constructor of parent class (passing in old information)
        this.litterBoxSize = litterBoxSize;
        this.meowsLoudly = meowsLoudly;
    }


    @Override //Annotations are not actions, it tells the compiler something (What comes next overrides another method)
    public String getInfo()                     //meant to override a method in a superclass (main class)
    {
        return super.getInfo() + "\nLitterBoxSize: " + this.litterBoxSize + "\nMeows Loudly: " + this.meowsLoudly;
    }

    public String getSpecies()
    {
        return this.species;    //We use protected rather than public/private since it's not avaiable in the sublcass. 
    }           


}