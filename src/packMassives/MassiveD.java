package packMassives;

import java.util.Arrays;

public class MassiveD {
    public static void main(String[] args) {
        String string = "ababababa";
        String str = "b";
        int sum = 0;
        if (string.isEmpty()){
            System.out.println("строка пуста");
        }char[] t = string.toCharArray();
        System.out.println(Arrays.toString(t));
        for (int i = 0;i<t.length;i++){
            if (string.equals(str)){
                sum++;
            }
        }
    }
}
