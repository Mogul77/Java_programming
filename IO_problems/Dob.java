import java.util.Scanner;

public class Dob{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.print(day+"/"+month+"/"+year);
    }
}