import java.util.Scanner;
public class Q15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        int n2000 = rupees/2000;
        rupees = rupees%2000;
        int n500 = rupees/500;
        rupees = rupees%500;
        int n200 = rupees/200;
        rupees = rupees%200;
        int n100 = rupees/100;
        rupees = rupees%100;
        System.out.println(n2000);
        System.out.println(n500);
        System.out.println(n200);
        System.out.println(n100);
        sc.close();


    }
}