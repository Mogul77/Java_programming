import java.util.Scanner;
public class Q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int sum1=0;
        int sum2=0;
        int tem = n;
            while(n!=0){
            int dig = n%10;
            sum = sum+dig;
            n = n/10;
            }
            while(sum!=0){
                int dig = sum%10;
                sum1 = sum1+dig;
                sum = sum/10;
            }System.out.println(sum1);
            while(sum1!=0){
                int dig = sum1%10;
                sum2= sum2+dig;
                sum1=sum1/10;
            }
        if(sum2 == 1)
            System.out.println("it is magic number");
        else 
            System.out.println("it is not magic number");

    }
}