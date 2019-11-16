import java.util.Scanner;

public class CaseA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = a;
        if (max < b){
            max = b;
        }else if (max < c){
            max = c;
        }else if (max < d){
            max = d;
        }else { }System.out.println(max);
    }
}