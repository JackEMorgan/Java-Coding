import java.util.Scanner;

/**
 * App
 */

public class PartnerLab2 {
    public static void main(String[] args) {
        //----------------------------------------------------------------------------------------------------------------s
        Scanner intro = new Scanner(System.in);
        System.out.println("Hello User! What is the name of your vehicle?");
        String minivan = intro.nextLine();
        RoadTrip trip = new RoadTrip(minivan);
        //----------------------------------------------------------------------------------------------------------------
        boolean s = false;
        while (s != true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Add a person to the trip? Type 'q' to quit.");
            String response = scan.nextLine();
            if (response.equals("q")) 
            {
               s = true;
            }
            else
            {
                Scanner temp = new Scanner(System.in);
                System.out.println("What is the persons first name?");
                String firstName = temp.nextLine();

                Scanner temp2 = new Scanner(System.in);
                System.out.println("What is the persons last name?");
                String lastName = temp2.nextLine();

                Scanner temp3 = new Scanner(System.in);
                System.out.println("What is the persons phone number?");
                String phoneNumber = temp3.nextLine();

                //-------------------------------------------------------------------------------------------------------

                Passenger p = new Passenger(firstName, lastName, phoneNumber);

                boolean foodCheck = false;
                while (foodCheck != true) {
                    Scanner done = new Scanner(System.in);
                    System.out.println("Does this person have a favorite food? Type 'q' to quit.");
                    String answer = done.nextLine();
                    if (answer.equals("q"))
                    {
                        foodCheck = true;
                    }
                    else
                    {
                        Scanner temp4 = new Scanner(System.in);
                        System.out.println("What is the users favorite food?");
                        String favFood = temp4.nextLine();
                        trip.addFavoriteFood(p, favFood);
                    }
                }

                if (trip.addPassenger(p) == true)
                {
                    System.out.println("Passenger added to the trip!");
                }
                else
                {
                    System.out.println("Minivan is full, passenger could not be added");
                }
            }
        }
    //----------------------------------------------------------------------------------------------------------------
    trip.addDiaryEntry("Group arrived at Yankee Stadium for Opening Day, 2022!");
    trip.addDiaryEntry("The minivan broke down near Beaver Stadium! Guess we can stay until the Blue and White game.");
    trip.addDiaryEntry("Making our way across the country, on our way to Ohio to visit some old friends!");
    //----------------------------------------------------------------------------------------------------------------
    trip.displayPassengers();
    trip.displayDiary();
    }
}