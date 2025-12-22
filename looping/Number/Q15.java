import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem = n;
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum == tem)
            System.out.println("it is perfect number");
        else
            System.out.println("it is not perfect number");

    }
}