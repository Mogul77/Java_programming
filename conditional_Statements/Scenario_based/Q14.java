import java.util.Scanner;

public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18)
            System.out.println("50rs");
        else if(age > 18 && age<50)
            System.out.println("60rs");
        else 
            System.out.println("55rs");
    }}