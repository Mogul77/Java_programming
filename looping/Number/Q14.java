import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int tem =n;
        while(n!=0){
            int fact=1;
            int dig= n%10;
            for(int i = 1;i<=dig;i++)
                fact=fact*i;
            sum = sum + fact;
            n=n/10;
        }
        if(sum == tem)
            System.out.println("it is Strong number");
        else
            System.out.println("it is not Strong number");


    }
}