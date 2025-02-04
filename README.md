# Java
Java 

Types of variables  3 types :

Local - declared inside the body
 
Example : 

public class Local {
  Public static void main (String [] args ) {
        Int num = 10 ;
        System.out.println(“Variable ”+num );
      }
}


Instance - declared inside the class but outside the body  
Example : 

import java.io.*;
class DNT
{
 public String student; // Declared Instance Variable
 public DNT()
 { // Default Constructor
  this.student= "Urmi Bose"; // initializing Instance Variable
 }
//Main Method
 public static void main(String[] args)
 {
  // Object Creation
  DNT name = new DNT();
  System.out.println("Student name is: " + name.student);
 }
}



Static - declared as static is called as static variable (using a keyword )
Example : 
class student {
    
    static int age ; 
    
}
public class Example {
    public static void main (String [] args ){
        student student1 = new student();
        student student2 = new student();
        student1.age = 19;
        student2.age = 21;
        student.age=20;
        System.out.println("Student 1's Age : "+student1.age);
        System.out.println("Student 1's Age : "+student2.age);
        
    }
}


