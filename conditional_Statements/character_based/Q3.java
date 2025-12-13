import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Character.toLowerCase(ch);
        if(ch>='a' && ch<='z')
            System.out.println("it is alphabet");
        else
            System.out.println("it is not alphabet");
    }}