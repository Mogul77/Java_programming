import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int tem = n;
        while(n!=0){
            int dig = n%10;
            sum = sum+(dig*dig*dig);
            n = n/10;
        }
        if(tem == sum)
            System.out.println("it is armstrong number");
        else 
            System.out.println("it is not Armstrong number");
    }
}