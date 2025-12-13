import java.util.Scanner;

public class Q14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3 ==0)
            if(a%5==0)
            System.out.println("it is divisible");
        else
            System.out.println("it is not divisible by both");


    }
}