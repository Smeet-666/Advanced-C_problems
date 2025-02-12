import java.util.Scanner;

public class practical1b1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();

        c = c+d;
        d = c-d;
        c = c-d;

        System.out.println("The value of c and d after interchanging their values is: " +c +" and " +d);
        sc.close();
    }
}