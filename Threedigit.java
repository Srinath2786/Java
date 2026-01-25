import java.util.*;
public class Threedigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100 && n<=999)
        {
            int v=(n/10)%10;
        if(v%5==0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        }
    }
}