import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int f = y1%10;
        int l = y2%10;
        if(f==l)
            System.out.println("it is equal");
        else 
            System.out.println("it is not equal");
    }}
