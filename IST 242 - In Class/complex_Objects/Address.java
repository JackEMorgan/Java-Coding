public class Address {
    private String addressLine1;
    private String addressLine2;
    // private String addressLine1;
    // private String addressLine2;
    // private String city;
    // private String state;
    // private String ZIP;

    public Address(String addressLine1, String addressLine2) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public String getInfo()
    {
        return "Line1: " + this.addressLine1 + "|n" + "Line2: " + this.addressLine2;
    }

}
