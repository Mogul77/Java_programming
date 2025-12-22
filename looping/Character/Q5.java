public class Q5{
    public static void main(String[] args) {

        System.out.println("A E I O U");
        for(int i = 65;i<91;i++){
            if((char)i=='A'|| (char)i=='E' || (char)i=='O' || (char)i=='I'|| (char)i=='U'){
                continue;
            }
            System.out.print((char)i+" ");
        }
    }
}