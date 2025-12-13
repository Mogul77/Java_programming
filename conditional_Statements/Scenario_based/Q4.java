import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bat = sc.nextInt();
        if(bat==100)
            System.out.println("battery full");
        else if(bat>=50 && bat<100)
            System.out.println("consumed");
        else 
            System.out.println("low");

    }}