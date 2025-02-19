import java.util.Scanner;

class BonusCount {
    void bonus(int currentYear , int joiningYear){

        if (joiningYear > currentYear) {
            System.out.println("invalid input");
        }
        int difference = currentYear - joiningYear;
        if (difference>3) {
            System.out.println("Bonus of 2500 is given to employee");
        }
        else{
            System.out.println("no bonus is given");
        }

    }
    
}
public class practical2b3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the current year: ");
    int currentYear = sc.nextInt();
    System.out.print("Enter the year in which the employee joined: ");
    int joiningYear = sc.nextInt();
    BonusCount b1 = new BonusCount();
    b1.bonus(currentYear, joiningYear);
    sc.close();
}
}


