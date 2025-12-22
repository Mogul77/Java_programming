import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char ch1 = sc.next().charAt(0);
        int s = (int)ch;
        int e = (int)ch1;
        for(int i = s;i<=e;i++){
            System.out.print((char)i+" ");
        }
    }
}