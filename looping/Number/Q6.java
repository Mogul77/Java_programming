import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =n;
        int rev =0 ;
        while(n!=0){
            int dig = n%10;
             rev = rev*10+dig;
             n=n/10;
        }
        if(c==rev)
            System.out.println("pallindrome");
        else 
            System.out.println("not pallindrome");

    }
}