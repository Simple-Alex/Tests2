import java.util.Scanner;

public class CaseH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество колонок: ");
        int a = sc.nextInt();
        System.out.println("Количество рядов: ");
        int b = sc.nextInt();
        for (int i= 0;a>i;i++){
            System.out.print("*");
        }
        for (int i=0;(b-2)>i;i++){
            for (int q= 0;a>=q;q++){
                if (q==1){
                    System.out.print("*");
                }else if (q>1&&q<a){
                    System.out.print(" ");
                }else if(q==a){
                    System.out.print("*");
                }else if (q<a){
                    System.out.println();
                }
            }
        }System.out.println();
        for (int i= 0;a>i;i++){
            System.out.print("*");
        }
    }
}
