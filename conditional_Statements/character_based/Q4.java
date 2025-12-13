import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Character.toLowerCase(ch);
        if(ch>='1' && ch<='9')
            System.out.println("it is digit");
        else
            System.out.println("it is not digit");
    }}