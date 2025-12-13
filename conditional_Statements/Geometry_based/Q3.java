import java.util.Scanner;
public class Q3{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x<0 && y>0)
            System.out.println("1st");
        else if(x>0 && y>0)
            System.out.println("2nd");
        else if (x<0 && y<0)
            System.out.println("3rd");
        else 
            System.out.println("4th");
    }
}