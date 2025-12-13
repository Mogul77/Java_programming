import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bil =0;
        if(units<=100){
            bil =0;
        }
        else if (units<=300 && units>100){
            bil = (units-100)*5;
        }
        else {
            bil = (200*5 )+(units - 300)*10;
        }
        if(units > 500){

            bil = bil+(bil*0.10);
        }
        System.out.println(bil);


    }}