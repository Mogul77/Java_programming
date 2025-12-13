import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        if (s1==s2 && s2==s3 &&s3==s4 && s4==s1)
            System.out.println("square");
        else 
            System.out.println("Retanlge");

    }}
