package packMassives;

public class MassiveA {
    public static void main(String[] args) {
        int[] arr = {0,5,2,4,7,1,3,19};
        int dec = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]%2 ==1){
                dec++;
            }
        }
        System.out.println("нечетных цифр: "+dec);
    }
}
