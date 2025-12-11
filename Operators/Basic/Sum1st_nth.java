import java.util.Scanner;
public class Sum1st_nth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = a%10;
         a = a/10;
         int n2 = a/10;
         System.out.println("sum of digits "+ (n1+n2));
        
    }
}