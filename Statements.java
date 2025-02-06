import java.util.Scanner;
public class Statements{
    public static void main (String [] args ){
        Scanner  input = new Scanner(System.in);
                System.out.println("Enter Your Number : ");
                int a = input.nextInt();
        if (a>0){
            System.out.println(a+ " Is a Positive Number");
        }        

        else {
            System.out.println(a+ " Is a Negative Number");
        }
    
    }   
}
