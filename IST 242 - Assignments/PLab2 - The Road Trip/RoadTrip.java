import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

public class RoadTrip {
    private String minivanName;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private HashSet<String> diaryEntries = new HashSet<>();
    private HashMap<String, ArrayList<String>> favfoodsByPerson = new HashMap<>();

    public RoadTrip(String minivanName) {
        this.minivanName = minivanName;
        this.passengers = new ArrayList<>();
        this.diaryEntries = new HashSet<>();
        this.favfoodsByPerson = new HashMap<>();
    }

    public boolean addPassenger(Passenger p)
    {
        if(passengers.size() < 8)
        {
            passengers.add(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void displayPassengers() 
    {
        Iterator passIter = passengers.iterator(); 
        while (passIter.hasNext())
        {
            Passenger p = (Passenger)passIter.next();
            System.out.println(p + "\n" + favfoodsByPerson.get(p.getFullName()));
        }
    }

    public HashSet<String> addDiaryEntry(String s)
    {
        diaryEntries.add(s);
        return diaryEntries;
    }

    public void displayDiary()
    {
        Iterator diaryIter = diaryEntries.iterator(); 
        while (diaryIter.hasNext())
        {
            System.out.println(diaryIter.next());
        }
    }

    public void addFavoriteFood(Passenger p, String food) 
    {
        ArrayList<String> favFoods = new ArrayList<>();
        if (favfoodsByPerson.containsKey(p.getFullName()))
        {
            favfoodsByPerson.get(p.getFullName()).add(food);
        }
        else
        {
            favFoods.add(food);
            favfoodsByPerson.put(p.getFullName(), favFoods);
        }
    }

    @Override
    public String toString() {
        return "RoadTrip [diaryEntries=" + diaryEntries + ", favFoods=" + favfoodsByPerson + ", minivanName=" + minivanName
                + ", passengers=" + passengers + "]";
    }
}
