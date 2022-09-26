import java.util.ArrayList;
/**
 * App      Why OOP? = Allows us to focus on the objects rather than the function itself.
 *          Very good for DRY - Don't Repeat Yourself (Repeatable Code). Large Multiplayer Enviornments is a perfect example
 */
public class App {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        Student jane = new Student("Jane Doe", 3.90, "IST");
        jane.addPet("Cheeto");
        jane.addPet("Tiny");

        ArrayList<String> janesPets = jane.getPets();

        System.out.println("Jane's Pets: " + janesPets);
        for(int i = 0; i < janesPets.size(); i++)
        {
            System.out.println("Pet: " + janesPets.get(i));
        }
        for (String pet: janesPets) //Advanced for loop. For each pet in that arrayList, do something
        {
            System.out.println("Pet: " + pet);
            System.out.println(pet);
        }

        

        // System.out.println(jane.getInfo());                     //encapsulating that method with specific instance (jane.getInfo())

        // Student jack = new Student("Jack Morgan", 4.00, "Cyber");
        // System.out.println(jack.getInfo());                     //Gives each entity a chance to manage itself

        // Student janet = new Student ("Janet Smith");
        // janet.setGPA(4.0);
        // janet.setMajor("Acounting");

        // Employee jared = new Employee("Jack Morgan", 20, 100000, "Cyber Analyst");
        // System.out.println(jared.getInfo());


    }
}
