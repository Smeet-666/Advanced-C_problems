// Write a Program to calculate and display the volume of a CUBE having its height (h=10cm), width
// (w=12cm) and depth (8cm).

import java.util.Scanner;

public class practical1a3 {
    static class calculateVolume {
        double height;
        double width;
        double depth;

        calculateVolume(double width,double height,double depth){
            this.height=height;
            this.width=width;
            this.depth=depth;
        }

        double volume(){
            return (height*width*depth);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of cube: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of cube: ");
        double height = sc.nextDouble();
        System.out.println("Enter the depth of cube: ");
        double depth = sc.nextDouble();

        calculateVolume v1 = new calculateVolume(width, height, depth);
        System.out.println("The volume of cube is: "+v1.volume()+" cm^3");

        sc.close();

    }
}
