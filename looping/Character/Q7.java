import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int one=0,zero=0;
        while(binary!=0){
            int dig =binary%10;
            if(dig==1)
                one++;
            else
                zero++;
            binary/=10;
        }
        System.out.println("one: "+one);
        System.out.println("zero: "+zero);
    }
}