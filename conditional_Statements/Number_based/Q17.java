import java.util.Scanner;

public class Q17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l1 = a%10;
        int l2 = b%10;
        if(l1==l2)
            System.out.println("it is equal");
        else
            System.out.println("it is not equal");

    }
}