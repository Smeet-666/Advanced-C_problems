import java.util.Scanner;

public class practical1b2 {

    static class areaOfTriangle {
        double area(double a,double b,double c,double s){
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1st side: ");
        double a = sc.nextDouble();
        System.out.println("Enter the length of 2nd side: ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of 3rd side: ");
        double c = sc.nextDouble();

        double s =(a+b+c)/2;

        areaOfTriangle a1 =new areaOfTriangle();
        double area = a1.area(a, b, c, s);

        System.out.println("the are aof given triangle is: "+ area);
        
        sc.close();


    }
}
