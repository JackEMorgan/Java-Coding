public class House implements Buildable, Comparable<House> {
    private String owner;
    private Double length;
    private Double width;
    private Double height;
    private Double materialCosts;
    private Double employeeCosts;
    private Double otherCosts;
    private int hoursWorking;

    public House(String owner, Double length, Double width, Double height, Double materialCosts, Double employeeCosts, double otherCosts, int hoursWorking)
    {
        this.owner = owner;
        this.length = length;
        this.width = width;
        this.height = height;
        this.materialCosts = materialCosts;
        this.employeeCosts = employeeCosts;
        this.otherCosts = otherCosts;
        this.hoursWorking = hoursWorking;
    }

    @Override
    public double calculateCost()
    {
        double cost = this.materialCosts + this.employeeCosts + this.otherCosts;
        return cost;
    }

    @Override
    public int getTime_Building()
    {
        return this.hoursWorking;
    }

    @Override
    public double calculateArea()
    {
        double area = length * width * height;
        return area;
    }

    @Override
    public String toString()
    {
        return "\nOwner: " + this.owner + "\nLength: " + this.length 
        + "\nWidth: " + this.width + "\nHeight: " + this.height 
        + "\nMaterial Costs: " + this.materialCosts + "\nEmployee Costs: " + this.employeeCosts 
        + "\nOther Costs: " + this.otherCosts + "\nHours Working: " + this.hoursWorking
        + "\n";
    }

    @Override
    public int compareTo(House house)
    {
        int compare = this.length.compareTo(house.length);
        //String compare = this.owner.compareTo(house.owner);
        return compare;
    }
}
