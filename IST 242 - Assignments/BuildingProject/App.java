import java.util.ArrayList;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Address a1 = new Address("459 Bedford Rd", "Bedford Hills", "New York", 10507);
        Address a2 = new Address("419 E Beaver Ave", "State College", "Pennsylvania", 16801);
        Address a3 = new Address("7 Bliss Rd", "Pound Ridge", "Connecticut", 12042);
        Address a4 = new Address("1076 S bedford Rd", "Bedford", "New York", 10508);

        CircularSilo b1 = new CircularSilo(100000, "White", "Jack Morgan", a1, 150, 10000);
        CircularSilo b2 = new CircularSilo(250000, "Black", "Jared Scher", a2, 350, 12000);
        RectangularRanch b3 = new RectangularRanch(90000, "Blue", "Jack Morgan", a3, 100, 100, 200);
        RectangularRanch b4 = new RectangularRanch(100000, "Red", "James Schultz", a4, 150, 100, 200);

        ArrayList<Building> buildings = new ArrayList();
        buildings.add(b1);
        buildings.add(b2);
        buildings.add(b3);
        buildings.add(b4);

        for(Building b: buildings)
        {
            System.out.println(b.getInfo() + "\n");  
        }
    }
}