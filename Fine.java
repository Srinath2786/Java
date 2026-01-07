import java.util.*;
public class Fine {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n>=40){
            System.out.println("MemberShip Canclled");
        }
        if(n>5){
            System.out.println("Fine 1 rupees");
        }
        if(n>10){
            System.out.println("Fine 10 rupees");
        }
        else{
            System.out.println("Fine 50 paise");
        }
    }
}
