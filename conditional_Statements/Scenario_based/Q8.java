import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();
        int pin =3456;
        if(dig == pin)
            System.out.println("Allow");
        else 
            System.out.println("dont Allow");

    }}