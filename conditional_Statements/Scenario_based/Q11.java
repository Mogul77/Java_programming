import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if(amt>2000){
            double dis = (0.05)*amt;
            double payamt = amt - dis;
            System.out.println(payamt);
        }
        else if(amt<2000){
            double dis = (0.03)*amt;
            double payamt = amt - dis;
            System.out.println(payamt);
        }

    }}