import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Odd numbers  1 to 100");
        for(int i=1;i<=100;i+=2){
            System.out.print(i+" ");
        }
    }
}
