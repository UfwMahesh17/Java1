class student {
    
    static int age ; 
    
}
public class StaticVariableExercise {
    public static void main (String [] args ){
        student student1 = new student();
        student student2 = new student();
        student1.age = 19;
        student2.age = 21;
        student.age=20;
        System.out.println("Student 1's Age : "+student1.age);
        System.out.println("Student 2's Age : "+student2.age);
        
    }
}
