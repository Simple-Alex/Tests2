import java.util.Scanner;

public class CaseD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a+b)>c && (a+c)>b && (c+b)>a){
                    System.out.println("такой треугольник существует");
                }else {
            System.out.println("такой треугольник не может существовать");}
    }
}
