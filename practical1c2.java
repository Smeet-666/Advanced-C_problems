import java.util.Scanner;

public class practical1c2 {
    
    public static double discount(double principal,double discount){
        double total = principal*(1-(discount/100));
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the value in percentage to be discounted: ");
        double discount = sc.nextDouble();
        System.out.println("Total after discount is: ");
        System.out.println(discount(principal, discount)+"Rs");
        sc.close();

    }
}
