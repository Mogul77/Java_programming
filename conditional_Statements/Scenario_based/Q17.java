import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1: case 7: System.out.println("450");break;
            default:System.out.println("259");
        }

    }}