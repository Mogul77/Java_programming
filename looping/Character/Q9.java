import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec=0;
        int pow=0;
        while(bin!=0){
            int lastdig = bin%10;
            dec = dec+lastdig*(int)Math.pow(2,pow);
            pow++;
            bin/=10;
        }
        System.out.println(dec);
    }
}