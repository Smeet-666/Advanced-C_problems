import java.util.Scanner;

public class practical2a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        Double a = sc.nextDouble();
        System.out.println("Enter the number b");
        Double b = sc.nextDouble();
        
        Double result = a*b;
        if(result>100){
            System.out.println("product is greater than 100");
        }
        else if (result==100) {
            System.out.println("product is equal to 100");
        }
        else{
            System.out.println("product is less than 100");
        }
        sc.close();


    }
}