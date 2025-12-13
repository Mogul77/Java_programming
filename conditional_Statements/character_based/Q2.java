import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println("it is upper case");
        else if (ch>='a' && ch<='z')
            System.out.println("it is lowercase");
        else if (ch>='1'&& ch<='9')
            System.out.println("it is digit");
        else 
            System.out.println("it is special character");
        
    }}
