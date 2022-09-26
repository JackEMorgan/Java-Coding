import java.util.ArrayList;
import java.util.Collections;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList();
        //Add New House (Owner, Length, Width, Height, Materials, Employee Total Pay, Other costs, Hours Worked)
        houses.add(new House("Jack", 100.0, 100.0, 100.0, 250000.0, 150000.0, 50000, 650));
        houses.add(new House("James", 200.0, 200.0, 200.0, 500000.0, 300000.0, 10000, 1300));
        houses.add(new House("Jared", 30.0, 40.0, 60.0, 30000.0, 20000.0, 5000.0, 300));
        houses.add(new House("Josh", 400.0, 550.0, 80.0, 750000.0, 500000.0, 20000.0, 2000));
        houses.add(new House("Mike", 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1));
        Collections.sort(houses);
        System.out.println(houses);
    }
}