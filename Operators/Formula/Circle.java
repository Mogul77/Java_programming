import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        int r = sc.nextInt();
        System.out.println(pi*(r*r));
        System.out.println(2*pi*r);

    }
}