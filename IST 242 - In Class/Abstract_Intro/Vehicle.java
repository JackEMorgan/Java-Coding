public abstract class Vehicle {            //Abstract classes = 'template' for future classes (Ex. Partial blueprint for a house)
    private double weight;                 //"Function as a base for subclasses". Cannot create new instances
    private int numPassengers;

    public Vehicle(double weight, int numPassengers)
    {
        this.weight = weight;
        this.numPassengers = numPassengers;
    }

    public String getInfo() 
    {
        return "\nWeight: " + this.weight + 
        "\nNumPassengers: " + this.numPassengers;
    }

    public abstract void turnLeft();

}