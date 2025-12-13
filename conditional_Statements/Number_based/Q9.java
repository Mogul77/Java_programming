import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num&1)==0)
            System.out.println("it is even");
        else
            System.out.println("it is odd");

    }
}