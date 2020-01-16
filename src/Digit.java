import java.lang.reflect.Array;
import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int num = digit / 1000 % 10;
        int num1 = digit / 100 % 10;
        int num2 = digit / 10 % 10;
        int num3 = digit % 10;
        if (num==num3&&num1==num2){
        System.out.println("lucky ticket");
        }else {
            System.out.println("non lucky ticket");
        }
                }
                }
