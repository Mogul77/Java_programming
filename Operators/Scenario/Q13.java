import java.util.Scanner;

public class Q13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tot  = sc.nextInt();
        int free = tot/4;
        int payfor = tot - free;
        System.out.println(payfor*20); //mango price is 20rs


    }
}