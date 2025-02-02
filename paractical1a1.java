import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter marks for Subject " + i + " out of 100: ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid input! Enter marks between 0 and 100: ");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }

        double percentage = (totalMarks / (double) (4 * 100)) * 100;

        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.printf("Percentage : "+percentage);

        sc.close();
    }
}