import java.util.Scanner;


public class Cuboid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(l*b*h);
        System.out.println(2*((l*b)+(b*h)+(h*l)));
    }}
