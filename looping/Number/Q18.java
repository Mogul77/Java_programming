import java.util.Scanner;
public class Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%10==7){
            System.out.println("it is Buzz number");
            return;
        }
        else if (n%7==0){
            System.out.println("it is Buzz number");
        }
        else 
            System.out.println("it is not Buzz number");

    }
}