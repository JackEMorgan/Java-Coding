import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Notes:
 * ArrayList = stores a list of items in a dynamically sized array
 * Linked List = Allows speedy insertion and removal of items from the list (Ex: Names of fishers in a race)

 * Sets are unordered* and elements are unique* (Rapidly determins if x is a member in a set, Ex: Books in a collection)
 * Hash Set = Uses hash tables to speed up finding, adding, and removing elements
 * Tree Set = Uses a binary tree to speed up finding, adding, and removing elements
 * 
 * Maps store keys, values and the associations between them (Similar to dictionaries?) -> (Phone Number Lookup)
 * Keys = A lookup code or simple way to reference an object
 * Values = The actual object that is associated with the key (Keys are unique -> Similar to dictionaries!)
 */
 
public class App {

    public static void main(String[] args) {

        //Pet spot = new Pet("Spot", 10, 12.4);
        //System.out.println(spot);

        // HashSet<Pet> pets = new HashSet();
        // pets.add(spot);
        // pets.add(new Pet("Ranger", 10, 73.9));
        // pets.add(new Pet("Annabelle", 2, 8.5));

        // System.out.println(pets.contains(new Pet("Ranger",0,0))); //We have name as the defining attribute with hashCode
        // //Have to pass in a new object as a comparison, Use 0 for other attributes (assuming "" for empty string)

        HashMap<Integer,Pet> petsByNum = new HashMap(); //Can map an integer to an arrayList of pets (HW Assignment/Assignment?)
        petsByNum.put(111, new Pet("Ranger", 10, 73.9));
        petsByNum.put(222, new Pet("Annabelle", 2, 8.5));

        System.out.println(petsByNum.get(111));

        //If I wanted to store a bunch of Pets by Onwer name
        HashMap<String, ArrayList<Pet>> petsByOwner = new HashMap();

        ArrayList<Pet> joesPets = new ArrayList();

        joesPets.add(new Pet("Cheeto", 54, 12.3));

        petsByOwner.put("Joe Smith", joesPets);
        
        if (petsByOwner.containsKey("Joe Smith"))
        {
            petsByOwner.get("Joe Smith").add(new Pet("Fluffy", 4, 12.1));
        }


        HashSet<String> magSubs = new HashSet(); //Hashsets ignore repeats!
        magSubs.add("Mtn Biking");
        magSubs.add("Drum World");
        magSubs.add("Rock Music");

        Iterator setIter = magSubs.iterator();  //Normally methods have a noun and a verb, this one does not... stupid.
        while(setIter.hasNext())
        {
            System.out.println(setIter.next());
        }

        // for (String s: magSubs)
        // {
        //     System.out.println(s);
        // }

        // System.out.println(magSubs.contains("Skiing")); //Returns boolean t/f
        // System.out.println(magSubs.contains("Mtn Biking")); 

        
        //-------------------------------------------------------------------------------------------------

        HashMap<String, Integer> petWeightByName = new HashMap();
        petWeightByName.put("Fluffy", 9); //Put the relationship in place
        petWeightByName.put("Ranger", 67);
        petWeightByName.put("Annabelle", 7);

        Iterator petIter = petWeightByName.keySet().iterator(); //Use .values for the values and .entrySet for entire set
        while (petIter.hasNext())
        {
            System.out.println(petIter.next());
        }

        // Iterator petIter2 = petWeightByName.entrySet().iterator();
        // while(petIter2.hasNext())
        // {
        //     System.out.println(petIter2.next());
        // }

        //System.out.println(petWeightByName.get("Fluffy"));
        //boolean isSteveThere = petWeightByName.containsKey("Steve"); //Then perform .get if isSteveThere returns true

        //System.out.println(petWeightByName.containsKey("Steve")); //Boolean value return

        // if (petWeightByName.get("FLuffy") == null)
        // {
        //     System.out.println("No Fluffy Here.");
        // }
        // else
        // {
        //     System.out.println("Fluffy weights: " + petWeightByName.get("Fluffy"));
        // }

        for (String s: petWeightByName.keySet())
        {
            System.out.println(s);
        }

        for (Integer i: petWeightByName.values())
        {
            System.out.println(i);
        }

        for(Object o: petWeightByName.entrySet())
        {
            System.out.println(o);
        }

    }
}