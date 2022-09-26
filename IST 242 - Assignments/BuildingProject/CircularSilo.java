public class CircularSilo extends Building {
    private double radius;
    private double height;

    public CircularSilo(double purchaseCost, String color, String owner, Address address, double radius, double height)
    {
        super(purchaseCost, color, owner, address);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() 
        + "\nRadius: " + this.radius
        + "\nHeight: " + this.height;
    }

    @Override
    public double calculateVolume()
    {
        return Math.PI * (radius * radius) * height;
    }
}
