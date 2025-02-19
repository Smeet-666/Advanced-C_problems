import java.util.Scanner;

public class practical2c2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        System.out.print("Enter number c: ");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("All numbers are equal. No second largest number.");
        } else {
            int secondLargest;

            if ((a > b && a < c) || (a > c && a < b)) {
                secondLargest = a;
            } else if ((b > a && b < c) || (b > c && b < a)) {
                secondLargest = b;
            } else {
                secondLargest = c;
            }

            System.out.printf("%d is the second largest number.\n", secondLargest);
        }
        sc.close();
    }
}
