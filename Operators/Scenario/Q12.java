import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sell = sc.nextInt();
      int loss = sc.nextInt();
      int cost = sell + loss;
      System.out.println(cost);  
    }}
