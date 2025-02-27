import java.util.Scanner;

public class practical3a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the driver married or not: ");
        String married = sc.nextLine();
        System.out.print("Enter the gender(m or f) of the driver: ");
        String gender = sc.next();
        System.out.print("Enter the age of driver: ");
        int age = sc.nextInt();

        if (married.equals("yes")) {
            System.out.println("the driver can insured");
        }
        else if(married.equals("no")  && gender.equals("m")  && age >=30){
            System.out.println("the driver can be insured");
        }
        else if (married.equals("no")  && gender.equals("f")  && age >=25) {
            System.out.println("the driver can be insured");
        }
        else{
            System.out.println("the driver cannot be insured");
        }
        sc.close();
    }
}
