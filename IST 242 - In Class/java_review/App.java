import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 * App
 */
public class App {                                

    // public static void sayHello()
    // {
    //     System.out.println("Hello There!");
    // }

    public static String getMsg()
    {
        return "Hello there!";
    }

    // public static void sayHelloByName(String name)          //Must specify variables being passed through
    // {
    //     System.out.println("Hello there, " + name);
    // }



    // public static void sayHelloNTimes(String name, int numTimes)
    // {
    //     for(int i = 0; i < numTimes; i++)                   //Don't forget variables are local not global unless declared globally
    //     {
    //         System.out.println("Hello, " + name);           //i is declared in the for loop so its only bound to the loop
    //     }
    //     for(int i = 0; i < 3; i++)
    //     {
    //         System.out.println("Three more things...");
    //     }
    // }



    //-------------------------------------------------------------------------------------------------------------------------------



    public static void main(String[] args) {                //void means no return, static means no object association, functional decomposition
        //Print Writer and File Writer
        try {
            PrintWriter pw = new PrintWriter("hello.txt");  //File name is hello.txt, same folder as App.java.
            pw.println("Thing 3");
            pw.println("Thing 4");  
            pw.close();             //Won't write anything until you close the file

            FileWriter fw = new FileWriter("hello_from_fw.txt", true); //True = automatically appends, False will overwrite
            fw.write("Thing 1\n");  //Need \n for new line
            fw.write("Thing 2\n");
            fw.close();

            System.out.println("From file:");

            //File myFile = new File("hello.txt")

            Scanner fileScan = new Scanner(new File("hello.txt"));      //Passing in a file object

            while(fileScan.hasNextLine()) //Returns Boolean (T/F)
            {
                System.out.println(fileScan.nextLine()); //returns value
            }

        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        //sayHello();
        //sayHelloByName("Janet");                            //Calling methods like how we call functions in Python
        //sayHelloNTimes("Jack", 3);
        System.out.println(getMsg());



        //----------------------------------------------------------------------------------------------------------------------------



        // String name = "Jack";                               //Strings/Char
        // int numCans = 6;                                    //Normal Ints
        // double outsideTemp = 11.03;                         //Doubles
        // boolean isSnowing = true;                           //Boolean values    
            
        // boolean isDone = false; 
        // Scanner scan = new Scanner(System.in);                   //System.in will go to the terminal to search for a user input

        // int day1Temp = 31;                                          //Arrays must have a given length to start, unless we use import
        // int day2Temp = 33;
        // int day3Temp = 29;

        // int numMiles = 25;                                        //If one operand is double, it will instead do double divison
        // int numGallons = 3;                                       //Or we can cast it with parenthesees infront of the value

        // double milesPerGallon = (double)numMiles / (double)numGallons;    //If both operands are integers, it will do integer divison
        // System.out.println(milesPerGallon);

        // int [] dailyTemps = new int[25];

        // dailyTemps[0] = 25;
        // dailyTemps[1] = 30;

        // System.out.println("Item 0 is " + dailyTemps[0]);



        //-----------------------------------------------------------------------------------------------------------------------------



        // for(int i = 0; i < dailyTemps.length; i++)
        // {
        //     System.out.println("Item " + i + " is " + dailyTemps[i]);
        // }

        // ArrayList<String> names = new ArrayList();                  // Generic type = when we declare it, we specify type of object/data
        // names.add("Jane");
        // names.add("Pete");
        // names.add("Jack");
        // System.out.println(names.get(0));

        // for (int i = 0; i < names.size(); i++)
        // {
        //     System.out.println("Item " + i + " is " + names.get(i));
        //}

        //ArrayList<Integer/Double>                                        //Can't use int for numbers, use intgeter and Double for doubles


        // while (!isDone)
        // {
        //     System.out.println("Are you done?");
        //     String response = scan.nextLine();

        //     if(response.equals("yes") || response.equals("yeah"))                               //.= is ignore case
        //     {
        //         isDone = true;
        //     }
        //     else
        //     {
        //         System.out.println("Going again...no");
        //     }

        // }


        // int numInchesOfSnow = 0;

        // while (numInchesOfSnow < 10)
        // {
        //     System.out.println("Num inches: " + numInchesOfSnow);
        //     numInchesOfSnow ++;                             //Can use + 1, += 1 or ++. Works with all operators.
        // }

        // for (int i = 0; i < 10; i++)                        //For loops are better if you know how many times you want to execute something
        // {
        //     System.out.println("Num Inches: " + i);
        // }



        //----------------------------------------------------------------------------------------------------------------------------



        // if (!isSnowing)
        // {
        //     System.out.println("It is not snowing.");
        // }

        // if (outsideTemp < 25)
        // {
        //     System.out.println("Wear a coat.");
        // }
        // else if ((outsideTemp >= 25) && (outsideTemp < 45)) //&& is and, || is or, ! is not equal or a negation
        // {
        //     System.out.println("Wear a sweatshirt.");
        // }
        // else
        // {
        //     System.out.println("You'll be warm enough.");
        // }

        // if (outsideTemp >= 90)
        // {
        //     System.out.println("Go swimming.");
        // }

        // System.out.println("Hello there, " + name + "!");   //string literal
    }
}


//Key Topics to Review

    //"Which of the following describes the behavior of this code...?"

    //"Which of the following creates a method that...?"

    //Facts about ArrayLists
        //Give us not needing to know size of list
        //understand that array lists require us to pass in reference types as opposed to types that just store a value
        //if it starts with a capital letter, you can pass it in (Ex, string, int, double) ArrayList<Integer>, ArrayList<String>
    //Need to review ^^^ !

    //Good programmign practices like DRY? (Don't Repeat Yourself)

    //Basics of the essential data types (Rounding, Integers, Doubles, Strings, etc...)



//FOR IA: 1
    //getBrideName
    //getGroomName
    //getNumGuests
    //getDJPlaylist
    //getSqFt
    //getGuestsPerSqFt
    //wedding.txt is the filename
    //while loop to read each file line