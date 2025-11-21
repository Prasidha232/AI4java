package week03;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[]args)
   {
    
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your marks");
   int marks = sc.nextInt();
   String pass = "Your Marks is greater than 40 hence you are passed";
   String fail = "Your Marks is lower than 40 hence you are fail";
   String zone = (marks>=40)?pass:fail;
   System.out.println(zone);

   
   
   
   
}
   
}