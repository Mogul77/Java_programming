import java.util.Scanner;

public class Sphere{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        int r = sc.nextInt();
        System.out.println(4*pi*r*r);
        System.out.println((4.0/3.0)*pi*r*r*r);

    }}
