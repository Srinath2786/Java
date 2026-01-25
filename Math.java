import java.util.*;
public class Math{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Last digit of " + n + " is " + (n % 10));
        }
        else{
            System.out.println("Invalid Input");
        }
   }
}