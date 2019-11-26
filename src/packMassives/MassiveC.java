package packMassives;

import java.sql.Array;
import java.util.Arrays;

public class MassiveC {
    public static void main(String[] args) {
        int[] arr1 = new int[15];
        int[] arr2 = new int[30];
        int i;
        for (i = 0;i<arr1.length;i++){
            arr1[i] = (int)(Math.random()*10);
            System.out.print(arr1[i]+" ");
            arr2[i] = arr1[i];
            arr2[i+15] = arr1[i]*2;
            System.out.println(arr2[i+15]+" ");
        }
    }
}
