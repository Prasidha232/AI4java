import java.util.Scanner;

/**
 * Write a description of class Pharmacistprogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pharmacistprogram
{
    public static void main(String[]args)
    
    {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the medicine name");
    String Medicinename =sc.nextLine();
    System.out.println("Enter the medicine description");
    String Description =sc.nextLine();
    System.out.println("Enter the Price of the medicine");
    int price =sc.nextInt();
    System.out.println("Enter the Quantity of the medicine");
    int quantity =sc.nextInt();
    System.out.println("Enter the Quantity Needed of the medicine");
    int neededquantity =sc.nextInt();


    
    
    
    

    System.out.println(Medicinename);
    System.out.println(Description);
    System.out.println(price);
    System.out.println(quantity);
    System.out.println("Needed quantity"+ (neededquantity));
    System.out.println("Current Stock"+ (quantity-neededquantity));


    

    
    
    
        
        
    
    }
}