import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int l = num%10;
        if(l%3==0)
            System.out.println("it is divisible");
        else
            System.out.println("it is not divisible");
    }}
