package packMethods;

import java.io.*;
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

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("read.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("read.txt"));
        write.write("str1");
        write.newLine();
        write.write("str2");
        write.close();
        reader.read();
        File fileTwo = new File("text.txt");
        try {
            fileTwo.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }
        File file = new File("b.txt");
        fileTwo.renameTo(file);
        file.delete();
        File folder = new File("lib");
        folder.mkdirs();
        File file1 = new File(".");
        File[] arr = file1.listFiles();
        for (File file2:arr){
            System.out.println(file2);
        }



    }
}

