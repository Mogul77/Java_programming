import java.util.Scanner;
public class Q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        int sum =0;
        while(sq!=0){
            int dig = sq%10;
            sum = sum +dig;
            sq = sq/10;
        }
        if(sum==n)
            System.out.println("it is neon number");
        else
            System.out.println("it is not neon number");
    }
}