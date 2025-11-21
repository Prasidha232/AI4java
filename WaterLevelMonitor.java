import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the water level");
    int waterlevel = sc.nextInt();
    String level = "water level is safe";
    String level1 = "water level has exceed 1000L";
    String zone = (waterlevel>=1000)?level1:level;
    System.out.println(zone);
    

    
    

    
    
    
    }
}