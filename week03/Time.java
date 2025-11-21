package week03;
import java.util.Scanner;


/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the time in seconds");
    int timeinsec = sc.nextInt();
    
  
    int hours = timeinsec / 3600;
    int remainder = timeinsec % 3600; //  % gives remainder
    int minutes = remainder / 60;
    int finalSeconds = remainder % 60;
    
    System.out.print("Timeinhour" + hours + "\n" + "Minutes:" + minutes + "\n" + "seconds:"  + finalSeconds );
    

    
    
    
    
    
    
    }
  
}