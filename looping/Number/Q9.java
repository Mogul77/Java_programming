import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Gcd ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        int d = b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        } Gcd = a;
        int Lcm = (c*d)/Gcd;
        System.out.println("lcm: "+ Lcm);
        System.out.println("Gcd: "+Gcd);


    }
}