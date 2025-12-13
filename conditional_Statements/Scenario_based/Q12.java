import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tem = sc.nextInt();
        if(tem<25)
            System.out.println("cold");
        else if (tem >25 && tem<45)
            System.out.println("pleasant");
        else if(tem>45 && tem <60)
            System.out.println("Hot");
        else 
            System.out.println("HeatWave");

    }}