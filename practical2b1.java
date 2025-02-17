import java.util.Scanner;

public class practical2b1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x");
        Double x = sc.nextDouble();

        if (x<=10) {
            Double y = 3*x+5;
            System.out.println(y);
        }
        else{
            Double y = 8*x+5;
            System.out.println(y);
        }
        sc.close();
    }
}
