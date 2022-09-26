import java.util.HashSet;
import java.util.HashMap;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        HashSet<String> jackStates = new HashSet();
        jackStates.add("PA");
        jackStates.add("NY");
        jackStates.add("CT");
        System.out.println(jackStates);

        HashMap<String, HashSet> statesByVisitor = new HashMap();

        statesByVisitor.put("Jack Morgan", jackStates);
        System.out.println(statesByVisitor);

        if (statesByVisitor.containsKey("Jack Morgan"))
        {
            statesByVisitor.get("Jack Morgan").add(new State("MA"));
        }

        //Can also add a state using this method: (Won't add Jack Morgan Twice, because it is unique)

        jackStates.add("CA");
        statesByVisitor.put("Jack Morgan", jackStates);
        
        for (String s: statesByVisitor.keySet())
        {
            System.out.println(s);
        }
        for (HashSet s: statesByVisitor.values())
        {
            System.out.println(s);
        }
    }


}