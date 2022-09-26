import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
/**
 * wedding
 */
public class wedding {

    public static void main(String[] args) {
        String brideName = getBrideName();
        String groomName = getGroomName();
        int numGuests = getNumGuests();
        Double SqFt = getSqFt();
        ArrayList<String> playlist = getPlaylist();
        Double personSqFt = getPersonPerSqFt(numGuests, SqFt);



        try {
            PrintWriter pw = new PrintWriter("wedding.txt");
            pw.println(brideName);
            pw.println(groomName);
            pw.println(numGuests);
            pw.println(SqFt);
            pw.println(playlist);
            pw.println(personSqFt);
            pw.close();

            Scanner fileScan = new Scanner(new File("wedding.txt"));
            while(fileScan.hasNextLine())
            {
                System.out.println(fileScan.nextLine()); 
            }

        }
        catch (Exception error)
        {
            error.printStackTrace();
        }
    }



    public static String getBrideName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the brides name? ");
        String brideName = scan.nextLine();
        return brideName;
    }



    public static String getGroomName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the grooms name? ");
        String groomName = scan.nextLine();
        return groomName;
    }



    public static int getNumGuests() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many guests will be attending? ");
        Integer numGuests = scan.nextInt();
        return numGuests;
    }



    public static Double getSqFt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the Square Footage of the area? ");
        Double SqFt = scan.nextDouble();
        return SqFt;
    }



    public static ArrayList getPlaylist() {
        ArrayList<String> playlist = new ArrayList();
        boolean isDone = false;
        while (!isDone) 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("What song would you like to add? Type Exit if Done");
            String song = scan.nextLine();
            if (song.equalsIgnoreCase("exit"))
            {
                isDone = true;
            }
            else
            {
                playlist.add(song);
            }
        }
        return playlist;
    }



    public static Double getPersonPerSqFt(int numGuests, double SqFt) 
    {
        double personSqFt = numGuests / SqFt;
        return personSqFt;
    }

}