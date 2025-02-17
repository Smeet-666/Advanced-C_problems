import java.util.Scanner;

public class practical2a4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();

        if (a%b==0) {
            System.out.println("a is evenly divisible by b");
        }
        else{
            System.out.println("not evenly divisible");
        }
        sc.close();
    }
}
