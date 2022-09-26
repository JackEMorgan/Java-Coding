public abstract class Building {
    private double purchaseCost;
    private String color;
    private String owner;
    private Address address;

    public Building(double purchaseCost, String color, String owner, Address address)
    {
        this.purchaseCost = purchaseCost;
        this.color = color;
        this.owner = owner;
        this.address = address;
    }

    public String getInfo()
    {
        return "Purchase Cost: " + this.purchaseCost
        + "\nBuilding Color: " + this.color
        + "\nBuilding Owner: " + this.owner
        +  "\n" + this.address.getInfo()
        + "\nVolume: " + calculateVolume();
    }

    public abstract double calculateVolume();
}
