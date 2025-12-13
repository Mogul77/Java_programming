import java.util.Scanner;

public class Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10)
            System.out.println("it is one digit");
        else if (a>9 && a<100)
            System.out.println("it is two digit");
        else 
            System.out.println("it is three digit");
    }}
