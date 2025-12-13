import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.print("Enter student marks: ");
        marks = sc.nextInt();
        switch (marks / 10) {

            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("Grade: A");
                break;

            case 6:
                System.out.println("Grade: B");
                break;

            case 5:
            case 4:
                System.out.println("Grade: C");
                break;

            default:
                System.out.println("Grade: Fail");
    }
}
}