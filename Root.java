import java.util.*;
public enum Root {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int root=(int)Math.sqrt(n);
        if(root*root==n){
            System.out.println(n+" is a perfect square");
        }
        else{
            System.out.println(n+" is not a perfect square");
        }
    }
}
