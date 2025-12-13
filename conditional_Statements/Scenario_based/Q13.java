import java.util.Scanner;

public class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bat = sc.nextInt();
        if(bat == 100)
            System.out.println("full");
        else if(bat>50 && bat<100)
            System.out.println("moderate");
        else 
            System.out.println("low");

    }}