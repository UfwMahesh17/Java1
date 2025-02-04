class DNT
{
 public String student; // Declared Instance Variable
 public int mark;

 public DNT()
 { // Default Constructor
  this.student= "Abc"; // initializing Instance Variable
  this.mark = 80 ;
 }
//Main Method
 public static void main(String[] args)
 {
  // Object Creation
  DNT name = new DNT();
  DNT mark = new DNT();
  
  System.out.println("Student Name is: " + name.student);
  System.out.println("Student Mark is :" + mark.mark);
 }
}
