import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        int lumber;
        int windows;
        int lumberCost;
        int windowsCost;
        double taxRate;
        double total;
        double grandTotal;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need? ");
        lumber = in.nextInt();
        System.out.println("How many windows do you need? ");
        windows = in.nextInt();

        lumberCost = lumber * 8;
        windowsCost = windows * 11;
        total = lumberCost + windowsCost;
        grandTotal = total + (total * taxRate);
        
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + grandTotal);
    }
}
