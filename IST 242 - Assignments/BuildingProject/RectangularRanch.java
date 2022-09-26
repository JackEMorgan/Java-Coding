public class RectangularRanch extends Building {
    private double length;
    private double width;
    private double height;

    public RectangularRanch(double purchaseCost, String color, String owner, Address address, double length, double width, double height)
    {
        super(purchaseCost, color, owner, address);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo()
        + "\nLength: " + this.length
        + "\nWidth: " + this.width
        + "\nHeight: " + this.height;
    }

    @Override
    public double calculateVolume()
    {
        return length * width * height;
    }
}
