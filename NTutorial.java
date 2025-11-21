import java.util.Scanner;

/**
 * Write a description of class NTutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NTutorial
{
   public static void main(String[]arg)
   
   {;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the FirstNumber");
    int firstValue = sc.nextInt();
    System.out.println("Enter the SecondNumber");
    int secondvalue=sc.nextInt();
    
    int bigger = (firstValue>secondvalue)?firstValue:secondvalue; // ? = true value  : false value
    // (firstValue>secondValue)?"GreaterNumber":"smallernumber" // ? = true value  : false value
    
    System.out.println("the bigger value form two number is" +bigger);

    
    
    }
   
   
    
    
   
}