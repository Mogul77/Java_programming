import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n*n;
        int r = s%10;
        if(n==r)
            System.out.println("it is automorphic number ");
        else
            System.out.println("it is not automorphic");

    }
}