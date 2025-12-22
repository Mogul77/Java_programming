import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem = n;
        int sum=0;
        while(n!=0){
            int dig = n%10;
            sum = sum + dig;
            n=n/10;
        }
        if(tem%sum==0)
            System.out.println("it is harshard number");
        else 
            System.out.println("it is not harshard number");
    }
}