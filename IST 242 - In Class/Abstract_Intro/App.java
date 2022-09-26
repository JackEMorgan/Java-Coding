import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle(400.0, 4);
        DumpTruck d1 = new DumpTruck(7000, 2, 25000);
        //System.out.println(d1.getInfo());
        //d1.turnLeft();

        Canoe c1 = new Canoe(100, 3, 2);
        
        //ArrayList are homogenous, they must be the same type! So will it work with objects of different variables
        //We will be able to make heterogeneous arrays by doing the following:
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(d1);
        vehicles.add(c1);


        //This is polymorphism. Simplifying code. Putting everything in a arraylist and performing action to every object!
        for(Vehicle v: vehicles) //for(Type name: arrayList name)
        {
            v.turnLeft();
        }

        //the object object, aka a cosmic superclass #Cosmic = everything out there!
        Object o1 = "Fred";
        Object o2 = 3.14159;
        Object o3 = new DumpTruck(8000, 3, 20000);
        ArrayList<Object> things = new ArrayList();
        things.add(o1);
        things.add(o2);
        things.add(o3);
        //Useful for complex data structures
        //Two big reasons why this is not a great practice
            //1. We can't use polymorphism unless method we are calling exists in the parent class as well as the child class


    }
}
