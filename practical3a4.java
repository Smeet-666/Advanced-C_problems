// Given three points (x1, y1), (x2, y2) and (x3, y3), write a program to check if all the three points fall on one 
// straight line

import java.util.Scanner;

public class practical3a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        double area = (0.5)*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));

        if (area == 0) {
            System.out.println("The given points are in straight line");
        }

        else{
            System.out.println("The given points are not in straight line");
        }
        sc.close();
    }
}
