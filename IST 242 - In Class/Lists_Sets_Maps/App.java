import java.util.HashMap;

/**
 * Notes:
 * ArrayList = stores a list of items in a dynamically sized array
 * Linked List = Allows speedy insertion and removal of items from the list (Ex: Names of finishers in a race)
 * Lists are ordered, lists allow duplicates

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
        HashMap<String, Integer> empSalaryByName = new HashMap();
        empSalaryByName.put("Jack", 500000);
        empSalaryByName.put("Jared", 100000);
        empSalaryByName.put("Yames", 1000000);

        for (String s: empSalaryByName.keySet())
        {
            if (s == "Jack")
            {
                System.out.println("Jack is here!");
            }
            System.out.println(s);
        }

        for (Integer i: empSalaryByName.values())
        {
            System.out.println(i);
        }

    }
}