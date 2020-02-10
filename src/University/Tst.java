package University;  //тестовый класс (не задерживатся!)

import java.util.Arrays;

public class Tst {
    public static void main(String[] args) {

        String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop","Neo4j"};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
