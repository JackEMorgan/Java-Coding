public interface Gradable {     //Define the set of methods required to be able to automatically grade their students.
    int NUM_GRADES_TO_DROP = 1;     //public static final int ... (Can access this anywhere in program, not changeable)
    //public static final int NUM_GRADES_TO_DROP = 1;
   
    double calculateGrade();
    int getAbsences();
}
