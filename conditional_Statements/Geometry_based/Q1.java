import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if(s1==s2 && s2==s3 && s3==s1)
            System.out.println("Equalateral");
        else if (s1==s2 || s2==s3 || s3==s1)
            System.out.println("isosceles");
        else 
            System.out.println("Scalene");
    }}
