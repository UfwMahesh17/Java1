import java.util.Scanner ; 
public class Calculator {
    public static void main (String [] args){
        System.out.println("Enter First Number :");
         Scanner  val1 = new Scanner(System.in);
                 int var1 = val1.nextInt();
        System.out.println("Enter Second  Number :");
         Scanner  val2 = new Scanner(System.in);
                 int var2 = val2.nextInt();

                 System.out.println("Enter Operation You Would Like to Perform  :");
                 System.out.println("Ex +,-,*,/");
                 Scanner  val3 = new Scanner(System.in);
                         String Operator = val3.nextLine();
             switch(Operator) {

                case "+" :
                System.out.println("The Addition of Two Values Are : " + (var1 + var2));
                break;

                case "-" :
                System.out.println("The Subtraction of Two Values Are : "+ (var1 - var2 ));
                break;

                case "*":
                System.out.println("The Multiplication of Two Values Are : "+ (var1 * var2));
                break;

                case "/":
                System.out.println("The Division of Two Values Are : "+ (var1 / var2));
                break;

                default :
                System.out.println("Enter a Valid Operator ");

            }          
        }
}

