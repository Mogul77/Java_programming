import java.util.Scanner;
public class Int2oct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int a = Integer.parseInt(b,8);
        System.out.print(a);
    }
}