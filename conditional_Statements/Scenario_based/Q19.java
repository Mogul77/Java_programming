import java.util.Scanner;

public class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = 100;
        double used = sc.nextInt();
        double gb = 1000;
        double per = (used/gb)*100;
        System.out.println(per);
        if(per==100)
            System.out.println("full");
        else if(per<100 && per>50)
            System.out.println("consumed");
        else if(per<50){
            System.out.println("low");
        }
        else 
            System.out.println("data over");


    }}