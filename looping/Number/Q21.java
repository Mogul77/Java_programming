import java.util.Scanner;
public class Q21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%3==0){
            n = n/3;
        } if(n==1)
            System.out.println("it is divisible by 3");
            else
                System.out.println("it is not divisible by 3");

    }
}