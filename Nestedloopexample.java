import java.io.*;
public class Nestedloopexample {
    public static void main(String[] args) {
        for (int week = 1;week <= 3; week++) { 
            System.out.println(" week" + week + ":");

            for (int day = 1; day <= 7; day++) { 
                System.out.println(" day " + day);
            }
        }
    }
}
