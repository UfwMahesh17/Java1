public class Operators {
    public static void main ( String [] args ){
 
    int x = 10;
    int y = 20;
    int z = 30;
    boolean a = true ;
    boolean b = false ;
    System.out.println(x++);
    System.out.println(x--);
    System.out.println(--x);
    System.out.println(++x);
    System.out.println(x++ + ++x);
    System.out.println(y++ + ++y);

    System.out.println(x-- - --x);
    System.out.println(y-- - --y);

    System.out.println(~x);   
    System.out.println(~y); 
    System.out.println(~z); 
    System.out.println(!a);  
    System.out.println(!b);
    System.out.println(10*10/5+3-1*4/2); 
    System.out.println(10<<2);
    System.out.println(10<<3); 
    System.out.println(20<<2);
    System.out.println(15<<4);
    System.out.println(10>>2); 
    System.out.println(20>>2);
    System.out.println(20>>3);
    System.out.println(20>>2);  
    System.out.println(20>>>2); 
    System.out.println(20>>2);  
    System.out.println(20>>>2); 

    }
}
