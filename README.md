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

Datatypes 


Java Control Statements | Control Flow in Java
Java compiler executes the code from top to bottom. The statements in the code are executed according to the order in which they appear. However, Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements. It is one of the fundamental features of Java, which provides a smooth flow of program.
Java provides three types of control flow statements.

1. Decision Making statements
    * if statements.  
    *              |
    *              |=======>if , else if , else , Nested statements 
    * switch statement
2. Loop statements
    * do while loop
    * while loop
    * for loop
    * for-each loop
3. Jump statements
    * break statement
    * continue statement


