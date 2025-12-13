import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int f = year/100;
        int l = year %100;
        if(f==l)
            System.out.println("it is equal");
        else
            System.out.println("it is not equal");

        
    }}
