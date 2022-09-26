public class App {

    public static void main(String[] args) {
        Animal cat1 = new Animal(10, "feline", 5);
        System.out.println(cat1.getInfo());


        Housecat cat2 = new Housecat(11, "feline", 6, 12.3, true);
        System.out.println(cat2.getInfo());
    }
}

//When writing code, you need to think:
//Which attributes in the child class make it different from the parent class

//Every olympian is a person
//But not every person is an olympian
//Example olympian classes that person desn't have:
//  Medal Count, Time Spent Training, Records Held

//Every olympic skiier is an olympian
//But not every olympian is a skiier
//Example olympic skiier classes that olympian doesn't have:
//  Type of Skiis Owned, Races Won, Trails Raced


//Why use Classes/Objects              = DRY + classes more accurately represent real-world entities, zoom in one object at a time
//Understanding classes vs instances   = instance is an example of a class or object created using a class (class = building block)
//Encapsulation                        = public and private methods. Attributes are private and methods to access are public. 
//Constructors                         = used to initialize objects, called when object of class is created
    //Multiple constructor rules       = Can't have the same arguments in the same order.
    //How are they called and named    = Animal cat1 = new Animal(10, "feline", 5);
    //Why do we use "this"             = specifies that we are talking about a certain class.
    //Order/type of parameters matters = !!!
//Non-static vs Static methods**       = not gonna call that method without it being associated with an instance. Needs to be non-static
//Basics of getters/setters            = used to obtain and set information. Only use arguments when setting data.
//Instantiating classes and calling their methods (instance.method()) Done with only non-static methods.