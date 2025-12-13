import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = sc.nextInt();
        if(a>=1 && a<=12){
            if(a==1 || a==3 || a==5 || a==7 ||a==8 || a==10 || a==12){
                System.out.println("31 days");
            }
            else if(a==2){
                if(y%400==0 || (y%4==0 && y%100!=0))
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
            }
            else 
                System.out.println("30 days");
        }
        else{
            System.out.println("invalid");
        }
    }
}