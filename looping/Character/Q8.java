import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";
        while(n!=0){
            int dig = n%2;
            binary = dig+binary;
            n=n/2;
        }
        System.out.println(binary);
    }
}