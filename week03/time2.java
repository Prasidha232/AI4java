package week03;
import java.util.Scanner;


/**
 * Write a description of class time2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class time2
{ 
    
    public static void main (String[]args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the days");
    int days = sc.nextInt();
    
    int year = days / 360 ;
    int remainder = days% 360;
    int months = remainder/30;
    int finaldays = remainder%30;
    
    System.out.print("years:" + year + "\n" + "moths:" + months + "\n" + "days"  + finaldays);

    
    
    
    
    
    
    
    }
    
}