import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Even numbers 1 to 100");
        for(int i=2;i<=100;i++){
            if(n%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
