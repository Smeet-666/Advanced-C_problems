import java.util.Scanner;

public class practical2a3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();

       if (a%6==0 && b%7==0) {
            System.out.println("both numbers are evenly divisible by 6 and 7");
       } 

       else{
        System.out.println("not evenly divisible by 6 and 7");
       }
       sc.close();
    }
}
