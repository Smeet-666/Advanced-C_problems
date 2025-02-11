import java.util.Scanner;

public class practical1a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 digit number: ");
        int n = sc.nextInt();
        int d1,d2,d3,d4,d5;
        d1 = n/10000;
        d2 = (n/1000)%10;
        d3 = (n/100)%10;
        d4 = (n/10)%10;
        d5 = n%10;

        int sum = d1+d2+d3+d4+d5;
        System.out.println("The sum of the digits of a five digit number is :"+ sum);
        sc.close();
        

    }
}
