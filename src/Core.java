import java.util.Scanner;

public class Core {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        switch (a){
            case (1):
                System.out.println(b + c);
                break;
            case (2):
                System.out.println(b - c);
                break;
            case (3):
                System.out.println(b * c);
                break;
            case (4):
                System.out.println(b/c);
                break;
            case (5):
                System.out.println(Math.sqrt(b));
                break;
            case (6):
                System.out.println(Math.pow(b,c));
                break;
            default:
                System.out.println("mistake");
        }
        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);
        app.setResizable(true);
    }
}