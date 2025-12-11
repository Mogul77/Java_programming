import java.util.Scanner;
public class Cylinder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double pi = 3.14;
        System.out.println(2*pi*r*(r+h));
        System.out.println(pi*r*r*h);
    }
}
