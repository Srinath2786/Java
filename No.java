import java.util.*;
public class No{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 17 || n == 33) {
            System.out.println("boundary");
        }
        else if (n > 17 && n < 33) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
