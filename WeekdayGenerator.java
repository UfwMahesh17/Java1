import java.util.Scanner;
public class WeekdayGenerator {
    public static void main (String [] args ){
                System.out.println("Enter The Number From 1 to 7 :");

        Scanner Input = new Scanner(System.in);
        int wk = Input.nextInt();
        System.out.println("The Weekday is : ");
        switch (wk){
                case 1:
                System.out.println(" Sundaay "); 
            break;
                case 2:
                System.out.println(" Monday "); 
            break;
                case 3:
                System.out.println(" Tuesday ");
            break;   
                case 4:
                System.out.println(" Wednesday ");
            break;
                case 5:
                System.out.println(" Thursday ");
            break;
                case 6:
                System.out.println("Friday ");
            break;
                case 7:
                System.out.println("Satuday ");
            break;
            default:
            System.out.println("Enter a Valid Input ");
            break;
            
                
                
                
                

    }
    }
}
