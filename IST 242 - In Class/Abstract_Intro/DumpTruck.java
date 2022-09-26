public class DumpTruck extends Vehicle {    //Inherits everything from vehicle, must include turnLeft now
    private int maxHaulAmt;

    public DumpTruck(double weight, int numPassengers, int maxHaulAmt)
    {
        super(weight, numPassengers);
        this.maxHaulAmt = maxHaulAmt;
    }

    public String getInfo()
    {
        return super.getInfo() + ", MaxHaul: " + this.maxHaulAmt;
    }

    @Override               //Why do we need Override here? There will be an error without flagging this turnLeft method
    public void turnLeft()
    {
        System.out.println("Signal left.");
        System.out.println("Turn wheel left");
        System.out.println("Floor it moron.");
    }
}
