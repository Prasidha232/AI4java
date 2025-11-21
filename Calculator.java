import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number");
   float firstnumber =sc.nextInt();
   System.out.println("Enter the second number");
   float secondnumber = sc.nextFloat();
   
   System.out.println("The sum of firstnumber and secondnumber is:"+ (firstnumber+secondnumber));
   System.out.println("The subtraction of firstnumber and secondnumber is:"+ (firstnumber-secondnumber));
   System.out.println("The Divison of firstnumber and secondnumber is:"+ (firstnumber/secondnumber));
   System.out.println("The Multiplication of firstnumber and secondnumber is:"+ (firstnumber*secondnumber));
   float bigger = (firstnumber>secondnumber)?firstnumber:secondnumber; 
   System.out.println("the bigger value form two number is" +bigger);
      
      
      
      
    }
  
}