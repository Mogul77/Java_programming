import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 1000;
        System.out.println("1.bank balance");
        System.out.println("2.Withdraw");
        System.out.println("3.deposit");
        System.out.println("4.exit");
        int ch = sc.nextInt();
        switch(ch){
            case 1 :System.out.println(bal);break;
            case 2 : 
            int with = sc.nextInt();
            if(with>bal)
                System.out.println("it exceeds your balance");
            else {
                System.out.println("Succussfully withdrawed");
                System.out.println("currenct balance"+ (bal - with));}
                break;
            case 3 :
                int dep = sc.nextInt();
                bal = bal+dep;
                System.out.println("deposited");
                System.out.println("current balance"+ (bal));break;
            case 4  : System.out.println("thank you");break;
            default:System.out.println("invalid command");


        }

    }}