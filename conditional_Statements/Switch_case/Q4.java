
import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month){
            case 1 : case 2: case 3: case 4:System.out.println("Summer");break;
            case 5 : case 6: case 7: case 8:System.out.println("spring");break;
            case 9 : case 10: case 11: case 12:System.out.println("winter");break;
        }

    }}