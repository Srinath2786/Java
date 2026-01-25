import java.util.*;
public class Lab{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=sc.nextInt();
        if(n<m && n<c){
            System.out.println("L1 has minimum seating capacity");
        }
        else if(m<n && m<c){
            System.out.println("L2 has minimum seating capacity");
        }
        else{
            System.out.println("L3 has minimum seating capacity");
        }
    }
}