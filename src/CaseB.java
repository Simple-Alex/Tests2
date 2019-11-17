import java.util.Scanner;

public class CaseB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        if (sum <= 36&& sum > 0){
            System.out.println("1 podezd;");
            if (sum <= 4){
                System.out.println("1 etazh;");
            }else if (sum >= 5 && sum <= 8){
                System.out.println("2 etazh;");
            }else if (sum >= 9 && sum <= 12){
                System.out.println("3 etazh;");
            }else if (sum >= 13 && sum <= 16){
                System.out.println("4 etazh;");
            }else if (sum >= 17 && sum <= 20){
                System.out.println("5 etazh;");
            }else if (sum >= 21 && sum <= 24){
                System.out.println("6 etazh;");
            }else if (sum >= 25 && sum <= 28){
                System.out.println("7 etazh;");
            }else if (sum >= 29 && sum <= 32){
                System.out.println("8 etazh;");
            }else if (sum >= 33 && sum <= 36){
                System.out.println("9 etazh;");
            }
        }if (sum >= 37&& sum <=72){
            System.out.println("2 podezd;");
            if (sum >=37&&sum<=40){
                System.out.println("1 etazh;");
            }else if (sum >= 41 && sum <= 44){
                System.out.println("2 etazh;");
            }else if (sum >= 45 && sum <= 48){
                System.out.println("3 etazh;");
            }else if (sum >= 49 && sum <= 52){
                System.out.println("4 etazh;");
            }else if (sum >= 53 && sum <= 56){
                System.out.println("5 etazh;");
            }else if (sum >= 57 && sum <= 60){
                System.out.println("6 etazh;");
            }else if (sum >= 61 && sum <= 64){
                System.out.println("7 etazh;");
            }else if (sum >= 65 && sum <= 68){
                System.out.println("8 etazh;");
            }else if (sum >= 69 && sum <= 72){
                System.out.println("9 etazh;");
            }
        }if (sum >= 73&& sum <=108){
            System.out.println("3 podezd;");
            if (sum >=73&&sum<=76){
                System.out.println("1 etazh;");
            }else if (sum >= 77 && sum <= 80){
                System.out.println("2 etazh;");
            }else if (sum >= 81 && sum <= 84){
                System.out.println("3 etazh;");
            }else if (sum >= 85 && sum <= 88){
                System.out.println("4 etazh;");
            }else if (sum >= 89 && sum <= 92){
                System.out.println("5 etazh;");
            }else if (sum >= 93 && sum <= 96){
                System.out.println("6 etazh;");
            }else if (sum >= 97 && sum <= 100){
                System.out.println("7 etazh;");
            }else if (sum >= 101 && sum <= 104){
                System.out.println("8 etazh;");
            }else if (sum >= 105 && sum <= 108){
                System.out.println("9 etazh;");
            }
        }if (sum >= 109&& sum <=144){
            System.out.println("3 podezd;");
            if (sum >=109&&sum<=112){
                System.out.println("1 etazh;");
            }else if (sum >= 113 && sum <= 116){
                System.out.println("2 etazh;");
            }else if (sum >= 117 && sum <= 120){
                System.out.println("3 etazh;");
            }else if (sum >= 121 && sum <= 124){
                System.out.println("4 etazh;");
            }else if (sum >= 125 && sum <= 128){
                System.out.println("5 etazh;");
            }else if (sum >= 129 && sum <= 132){
                System.out.println("6 etazh;");
            }else if (sum >= 133 && sum <= 136){
                System.out.println("7 etazh;");
            }else if (sum >= 137 && sum <= 140){
                System.out.println("8 etazh;");
            }else if (sum >= 141 && sum <= 144){
                System.out.println("9 etazh;");
            }
        }if (sum > 144){
            System.out.println("takoi kvartiri v etom dome net");
        }
    }
}
