import java.util.Arrays;
import java.util.Scanner;

public class cases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i =0; i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}