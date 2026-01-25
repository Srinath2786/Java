import java.util.*;
public class Midd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=(n/10)%10;
        if(s%5==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}