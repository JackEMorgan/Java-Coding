public class Address {
    private String lineOne;
    private String city;
    private String state;
    private int zip;

    public Address(String lineOne, String city, String state, int zip)
    {
        this.lineOne = lineOne; //Address Line 1 = Street Name + Num
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getInfo()
    {
        return "Street Name and Num: " + this.lineOne
        + "\nCity: " + this.city 
        + "\nState: " + this.state 
        + "\nZip: " + this.zip;
    }
}
