package packMethods;

public class MethodCaseB {
    public static String myMethod(int a, double b, String str){
        double sum = b + (double)a;
        String Sum = str + sum;
        System.out.println(Sum);
        return Sum;
    }

    public static int myMeth(int length, int width){
        for (int i = 0;i<width;i++){
            System.out.println();
            for (int i1 = 0;i1<length;i1++){
                System.out.print("*");
            }
        }return 0;
    }

    public static int yourMeth(int search){
        int a = (int)(Math.random()*10);
        int[] arr = new int[a];
        for (int i = 0;i<arr.length; i++){
            i = arr[i];
            if (arr[i]==search){
                return 1;
            }else if (arr[i]!=search){
                continue;
            }else{
                return 0;
            }
        }return 11;
    }

    public static void string() {
        String str = "asgdv maklsd lkasd";
        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
    }
}