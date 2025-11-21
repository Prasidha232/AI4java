package week03;
import java.util.Scanner;


/**
 * Write a description of class MathssOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathssOperation
{
    public static void main(String[]args)
    
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter firstnumber");
    int firstnumber = sc.nextInt();
    System.out.println("Enter Secondnumber");
    int secondnumber = sc.nextInt();
    
    String zone = (firstnumber>secondnumber)?"Firstnumberisgreater":"Secondnumberisgreater";
System.out.println(
    "The sum of first number and the second number is: " + (firstnumber + secondnumber) + "\n" +
    "The Subtraction of first number and the second number is: " + (firstnumber - secondnumber) + "\n" +
    "The Multiplication of first number and the second number is: " + (firstnumber * secondnumber) + "\n" +
    "The Division of first number and the second number is: " + (firstnumber / secondnumber)
);    



    
    
    
    
    
    
    
    
    
    }
}