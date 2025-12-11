import java.util.Scanner;

public class Power2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a&(a-1))==0?"True":"false");

    }}