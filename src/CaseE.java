import java.util.Scanner;

public class CaseE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ob = sc.nextInt();
        for (int row = 0; row < 5; row++) {
            for (int a = 0; a < ob; a++) {
                for (int col = 0; col < 3; col++) {
                    if (a % 2 == 1) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        /*for (int i = 0;i < ob;i++){
            if (ob%2==1){
                for (int a = 0;a < 5;a++){
                    for (int b = 0;b < 3;b++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else{
                for (int a = 0;a < 5;a++){
                    for (int b = 0;b < 3;b++){
                        System.out.print("*+");
                    }
                    System.out.println();
                }
            }
        }*/
    }
}
