import java.util.Scanner;

public class practical3a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int cost = sc.nextInt();
        System.out.print("Enter the selling price: ");
        int sell = sc.nextInt();

        if (cost>sell) {
            System.out.println("loss incurred");
            int loss = cost-sell;
            System.out.printf("loss of %d is incurred",loss);
        }
        else{
            System.out.println("profit made");
            int profit = sell -cost;
            System.out.printf("profit of %d is made",profit);   
        }
        sc.close();
    }
}