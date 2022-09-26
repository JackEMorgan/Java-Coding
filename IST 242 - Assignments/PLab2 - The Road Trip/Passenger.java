public class Passenger {
    private String fName;
    private String lName;
    private String phoneNum;

    public Passenger(String fName, String lName, String phoneNum) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "First Name = " + fName + ", Last Name = " + lName + ", Phone Number = " + phoneNum;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fName == null) ? 0 : fName.hashCode());
        result = prime * result + ((lName == null) ? 0 : lName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Passenger other = (Passenger) obj;
        if (fName == null) {
            if (other.fName != null)
                return false;
        } else if (!fName.equals(other.fName))
            return false;
        if (lName == null) {
            if (other.lName != null)
                return false;
        } else if (!lName.equals(other.lName))
            return false;
        return true;
    }

    public String getFullName()
    {
        return fName + " " + lName;
    }

    public String getfName()
    {
        return fName;
    }

    public String getlName()
    {
        return lName;
    }

    public String getphoneNum()
    {
        return phoneNum;
    }

}
