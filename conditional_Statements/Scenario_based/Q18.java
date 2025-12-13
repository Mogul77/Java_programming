import java.util.Scanner;

public class Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int bil =0;
        if(l<=1000)
            bil=0;
        else if(l>1000 && l<=3000){
            bil = (l-1000 + 999)/1000;
            bil = bil*5;
        }
        else {
            bil =(l-3000+999)/1000;
            bil = (2*5)+(bil*10);
        }
        System.out.println(bil);
       }
    }