import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        ArrayList<String> cats = new ArrayList();
        cats.add("Fred");
        cats.add("Wilma");
        cats.add("Applesauce");
        
        System.out.println(cats);
        Collections.sort(cats);
        System.out.println(cats);

        ArrayList<Student> students = new ArrayList();
        //Student s1 = new Student("Wendy", 3.8);
        students.add(new Student("Wendy", 3.8));
        students.add(new Student("Aaron", 3.7));
        students.add(new Student("Joe", 3.2));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}