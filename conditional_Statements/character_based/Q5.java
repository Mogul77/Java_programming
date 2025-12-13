import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2= sc.next().charAt(0);
        if(c1==c2)
            System.out.println("it is equal");
        else 
            System.out.println("it is not equal");
    }}
