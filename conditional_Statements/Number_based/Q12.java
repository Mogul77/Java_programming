import java.util.Scanner;
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int l = num%10;
        if(l%2==0)
            System.out.println("it is Even");
        else
            System.out.println("it is Odd");
    }}
