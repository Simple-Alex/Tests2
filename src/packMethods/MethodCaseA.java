package packMethods;

import java.util.Scanner;

public class MethodCaseA {
    public static void ArrayMaxDec(int a) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[a];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        //MethodCaseA.ArrayMaxDec(4);
        //MethodCaseB.myMethod(2,3.0, "str");
        //MethodCaseB.myMeth(4,5);
        MethodCaseB.yourMeth(5);
    }
}

