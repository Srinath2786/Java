import java.util.*;
public class rev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
            int sum=a%10;
            rev=rev*10+sum;
            a=a/10;
        }
        System.out.println(rev);
    }
}