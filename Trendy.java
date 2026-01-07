import java.util.*;
public class Trendy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=100 && a<=999){
            int sum=(a/10)%10;
            if(sum%3==0){
                System.out.println("Trendy Number");
            }
            else {
                System.out.println("Not a Trendy Number");
            }
        }
    }
}