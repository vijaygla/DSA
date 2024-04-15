import java.util.Scanner;

public class FoodCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input
        int X = scanner.nextInt(); // Cost of mess food per day
        int Y = scanner.nextInt(); // Cost of restaurant food per day
        
        // Calculate the total cost
        int weeklyCost = calculateWeeklyCost(X, Y);
        
        // Output the result
        System.out.println(weeklyCost);
        
        scanner.close();
    }
    
    public static int calculateWeeklyCost(int X, int Y) {
        // Cost for mess food for 6 days (excluding Sunday)
        int messCost = X * 6;
        
        // Cost for restaurant food on Sunday
        int sundayCost = Y;
        
        // Total weekly cost
        int totalCost = messCost + sundayCost;
        
        return totalCost;
    }
}

