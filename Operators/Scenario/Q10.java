import java.util.Scanner;

public class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        double pf = sal*0.08;
        double pen = sal*0.05;
        double actual = sal - (pf+pen);
        System.out.println(actual);

    }
}