import java.util.Scanner;


public class Dis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int d1 =(x2-x1);
        int d2 = (y2-y1);
        double res = Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));
        System.out.println(res);

    }}
