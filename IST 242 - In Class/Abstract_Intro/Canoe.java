public class Canoe extends Vehicle {
    private int numOars;

    public Canoe(double weight, int numPassengers, int numOars) 
    {
        super(weight, numPassengers);
        this.numOars = numOars;
    }

    //public String getInfo() - We know how to do this. same as DumpTruck
    //{

    //}

    @Override
    public void turnLeft() 
    {
        System.out.println("Paddle paddle paddle right!");    
    }

}
