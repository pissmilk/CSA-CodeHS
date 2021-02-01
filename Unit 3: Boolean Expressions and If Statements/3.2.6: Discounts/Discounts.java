import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Ask how many hours were you parked
        System.out.println("How many hours have you been parked?");
        double cost = input.nextDouble() * 3.5;
        // Compute cost - $3.50 per hour
        
        // If cost is over $20, set cost to $20
        if (cost > 20) {
            cost = 20;
        }
        // Display the final cost
        System.out.println("You owe $" + cost);
    }
}
