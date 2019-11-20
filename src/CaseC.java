import java.util.Scanner;

public class CaseC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0){
            System.out.println(year+" год - високосный");
            }else if (year % 100 == 0){
            System.out.println(year+" год - високосный");
        }else {
            System.out.println(year+" год - обычный");
        }
    }
}