import java.util.Scanner;

public class CaseF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 4 && a <= 15) {
            int factorial = 1;
            while (a > 1) {
                factorial *= a;
                a -= 1;
            }
            System.out.println(factorial);
        }
    }
}
