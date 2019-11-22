import java.util.Scanner;

public class CaseI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = height; i >= 0; i--) {
            for (int j = i; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; (height - 1) > i; i++) {
            for (int j = i; j < (height - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
