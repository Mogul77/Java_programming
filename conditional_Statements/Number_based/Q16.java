import java.util.Scanner;

public class Q16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 ==0 && a%5==0){
            if(a%8!=0)
            System.out.println("it is True");}
        else
            System.out.println("it is false");


    }
}