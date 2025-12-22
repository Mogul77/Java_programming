import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod =1;
        while(n!=0){
            int dig = n%10;
            prod*=dig;
            n/=10;
        }
        System.out.println(prod);
    }
}