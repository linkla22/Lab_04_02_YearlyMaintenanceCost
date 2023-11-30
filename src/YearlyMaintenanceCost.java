import java.util.Scanner;
public class YearlyMaintenanceCost {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your maintenance cost for Winter:$  ");
    var winterCost = sc.nextDouble();
    System.out.print("Enter your maintenance cost for Spring:$  ");
    var springCost = sc.nextDouble();
    System.out.print("Enter your maintenance cost for Summer:$  ");
    var summerCost = sc.nextDouble();
    System.out.print("Enter your maintenance cost for Fall:$  ");
    var fallCost = sc.nextDouble();

    var yearlyCost = winterCost + springCost + summerCost + fallCost;
    System.out.println("The total yearly cost of this year is : $" + yearlyCost);
    }
}
