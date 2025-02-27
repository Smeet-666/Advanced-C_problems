import java.util.Scanner;

public class practical3b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character here: ");
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println("The character is a Capital Letter.");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("The character is a Small Case Letter.");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("The character is a Digit.");
        } else {
            System.out.println("The character is a Special Symbol.");
        }
        sc.close();
    }
}
