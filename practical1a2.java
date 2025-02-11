// Write a program to calculate simple and compound interest. S.I. = (P × R × T)/100, CI = P (1 + r/n)nt
// - P

import java.util.Scanner;

public class practical1a2 {

    static class calculateInterest {
        double principalAmount;
        double rate;
        int timeInYears;

        // constructor
        calculateInterest(double principal, double rate, int time){
            this.principalAmount = principal;
            this.rate = rate;
            this.timeInYears = time;
        }

        double calculateSimpleInterest() {                      //method that calculates si
            return (principalAmount * rate * timeInYears) / 100;
        }

        double calculateCompoundInterest() {                    //method that calculates ci
            return principalAmount * Math.pow(1 + (rate / 100), timeInYears) - principalAmount;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double principal =sc.nextDouble();
        System.out.println("Enter rate: ");
        double rate =sc.nextDouble();
        System.out.println("Enter time in years: ");
        int time =sc.nextInt();

        System.out.println("The simple interest is: ");
        calculateInterest s1 = new calculateInterest(principal, rate, time);
        System.out.println(s1.calculateSimpleInterest());
        System.out.println("The compund interest is: ");
        calculateInterest c1 = new calculateInterest(principal, rate, time);
        System.out.println(c1.calculateCompoundInterest());

        sc.close();

    }
}
