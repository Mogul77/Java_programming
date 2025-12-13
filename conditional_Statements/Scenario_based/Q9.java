import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 1500;
        int with = sc.nextInt();
        if(bal>=with){
            if(with%100==0)
                System.out.println("validate amt");
            else
                System.out.println("invalidate amt");
        }
        else 
            System.out.println("amnt exceeds");
            

    }}