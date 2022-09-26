/**
 * Animal
 */
public class Animal {
    private double weight;
    protected String species;   //Protected makes it available to subclasses, but not other classes.
    private int age;

    public Animal(double weight, String species, int age) {
        this.weight = weight;
        this.species = species;
        this.age = age;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public String getInfo()
    {
        return "\nAnimal Info: " + "\nSpecies: " +  this.species + "\nWeight: " + this.weight + "\nAge: " + this.age;
    }
    
}