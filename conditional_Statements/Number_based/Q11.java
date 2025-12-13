import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f = a/100;
        if(f%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


    }}
