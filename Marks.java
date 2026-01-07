
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int marks=40;
        if(a<=40 && b<=50){
            System.out.println("Grade C");
        }
        else if(a<=50 && b>=60){
            System.out.println("Grade B");
        }
        else if(a<=60 && b>=70){
            System.out.println("Grade B+");
        }
        else if(a>=70 && b>=80){
            System.out.println("Grade A");
        }
        else if(a>=80 && b>=90){
            System.out.println("Grade A+");
        }
        else if(a>=90 && b>=100){
            System.out.println("Grade O");
        }
        else {
            System.out.println("Invalid error");
        }
    }
}
