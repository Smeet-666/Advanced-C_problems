import java.util.Scanner;

public class practical2c1 {

    static class IsLeapyear {
        void leapYear(int year){
            if (year%400 == 0) {
                System.out.println("it is a leap year");
            }
            else if (year % 4 == 0 && year%100!=0) {
                System.out.println("it is a leap year");
            }
            else{
                System.out.println("it is not a leap year");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year here: ");
        int year = sc.nextInt();
        IsLeapyear l1 = new IsLeapyear();
        l1.leapYear(year);
        sc.close();
    }
}
