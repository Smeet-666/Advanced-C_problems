import java.util.Scanner;

public class practical1c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int n = sc.nextInt();
        if (n>=0) {
            System.out.println("The absolute value of the given integer is "+ n);
        }
        else{
            System.out.println("The absolute value of the given integer is "+ -n);
        }
        sc.close();
    }
}
