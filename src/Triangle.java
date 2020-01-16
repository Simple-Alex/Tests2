import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        if (x1==6&&y1==1||x1==4&&y1==4
                ||x1==0&&y1==0||x1==3&&y1==3||
                x1==2&&y1==2||x1==1&&y1==1||
                x1==2&&y1==1||x1==4&&y1==1||
                x1==5&&y1==1||x1==3&&y1==2||
                x1==4&&y1==2||x1==5&&y1==2||
                x1==4&&y1==3||x1==3&&y1==1){
            System.out.println("+");
        }else {
            System.out.println("-");
        }
    }
}
