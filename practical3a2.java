import java.util.Scanner;

public class practical3a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of vehicle parked(c of car , b for bus , t for truck): ");
        String str = sc.next();
        System.out.println("enter the number of hours vehicle parked: ");
        int hour = sc.nextInt();
        if (str.equals("c")) {
            int costOfCar = 2*hour;
            System.out.printf("Cost of car parking is %d$",costOfCar);
        }
        else if (str.equals("b")){
            int costOfBus = 3*hour;
            System.out.printf("Cost of bus parking is %d$",costOfBus);
        }
        else if (str.equals("t")){
            int costOfTruck = 4*hour;
            System.out.printf("Cost of truck parking is %d$",costOfTruck);
        }
        sc.close();
    }
}
