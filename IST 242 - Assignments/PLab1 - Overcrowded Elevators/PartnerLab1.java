import java.util.Scanner;

/**
 * PartnerLab1
 */

public class PartnerLab1 {

    public static void main(String[] args) {
        Elevator elevatorOne = new Elevator();
        Integer firstEWeight = elevatorWeight();
        elevatorOne.setWeightLimit(firstEWeight);

        Elevator elevatorTwo = new Elevator();
        Integer secondEWeight = elevatorWeight();
        elevatorTwo.setWeightLimit(secondEWeight);

        //-----------------------------------------------------------------------------------------------------------------

        boolean eStatusOne = false;     //Elevator status (Full or not)
        while (eStatusOne == false) {
            String input = getResponse();
            if (input.equals("q"))
            {
                eStatusOne = true;
            }
            else
            {
                Scanner personName = new Scanner(System.in);
                System.out.println("What is the person's name? ");
                String name = personName.nextLine();

                Scanner personWeight = new Scanner(System.in);
                System.out.println("What is the person's weight? ");
                int weight = personWeight.nextInt();

                Person p = new Person(name, weight);

                if (elevatorOne.addPerson(p) == true)
                {
                    System.out.println("Person added.\n" + "\n" + p.getName() + "\n" + p.getWeight()); 
                }          
                else
                {
                    System.out.println("Person could not be added."); 
                }
            }
        }
        String listOne = elevatorOne.getString();
        System.out.println(listOne);

        //-------------------------------------------------------------------------------------------------------------------

        boolean eStatusTwo = false;     //Elevator two status (Full or not)
        while (eStatusTwo == false) {
            String secondInput = getResponse();
            if (secondInput.equals("q")) 
            {
                eStatusTwo = true;
            }
            else
            {
                Scanner personName = new Scanner(System.in);
                System.out.println("What is the person's name? ");
                String name = personName.nextLine();

                Scanner personWeight = new Scanner(System.in);
                System.out.println("What is the person's weight? ");
                int weight = personWeight.nextInt();

                Person p = new Person(name, weight);
                
                if (elevatorTwo.addPerson(p) == true)
                {
                    System.out.println("Person added.\n" + "\n" + p.getName() + "\n" + p.getWeight()); 
                }          
                else
                {
                    System.out.println("Person could not be added."); 
                }
            }
        }
        String listTwo = elevatorTwo.getString();
        System.out.println(listTwo);
    }


    public static int elevatorWeight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the weight of the elevator? ");
        Integer elevatorWeight = scan.nextInt();
        return elevatorWeight;
    }

    public static String getResponse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a person to the list? Type 'q' if you are done.");
        String response = scan.nextLine();
        return response;
    }
}