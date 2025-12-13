import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("red"))
            System.out.println("Stop");
        else if(str.equals("yellow"))
            System.out.println("get ready");
        else 
            System.out.println("go");

    }}