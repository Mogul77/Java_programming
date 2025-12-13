import java.util.Scanner;
public class Q20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int as = (int) ch;
        if(as%2==0)
            System.out.println("it is even");
        else
            System.out.println("it is odd");
    }
}