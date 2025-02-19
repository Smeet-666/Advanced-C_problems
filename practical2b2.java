import java.util.Scanner;

class TotalExpense {
    private double sum = 0.0;  // Keeps track of total expense

    public double addExpense(String item, double expense, int noOfItems) {
        double totalCost = noOfItems * expense;
        sum += totalCost;
        return sum;
    }

    public double getTotalExpense() {
        return sum;
    }
}

class Practical2b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TotalExpense t1 = new TotalExpense();  // Keeps track of total expense
        
        while (true) {
            System.out.println("Enter any string here (type 'quit' to exit): ");
            String str = sc.nextLine().toLowerCase().trim();

            if (str.equals("quit")) {
                break;
            }

            System.out.print("Enter the name of item: ");
            String item = sc.nextLine();

            System.out.print("Enter the price of item: ");
            double expense = sc.nextDouble();

            System.out.print("Enter the number of that item purchased: ");
            int noOfItems = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            double totalExpense = t1.addExpense(item, expense, noOfItems);
            System.out.println("Current total expense: " + totalExpense);
        }

        System.out.println("Final total expense: " + t1.getTotalExpense());
        sc.close();
    }
}
