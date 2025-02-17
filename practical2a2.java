import java.util.Scanner;

public class practical2a2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        Double a = sc.nextDouble();
        System.out.println("Enter the number b");
        Double b = sc.nextDouble();
        
        Double result = a*b;
        double half = a/2;

        if (result>half) {
            System.out.println("product is greater than half of a");
        }

        else if (result == half) {
            System.out.println("product is equal to half of a");
        }

        else{
            System.out.println("product is less than half of a");
        }
        sc.close();
    }
}
