import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%100==0)
            System.out.println("century year");
        else 
            System.out.println("not century year");

    }}
