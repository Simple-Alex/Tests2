package Shape;

import java.util.Arrays;
//ВОБЩЕМ ВОТ ЭТО ВСЕ ЧТО НИЖЕ СПИСАНО!! РАБОТАЕТ НЕ КОРРЕКТНО , СДЕЛАЮ КАК БУДЕТ ПОНИМАНИЕ ПРОИСХОДЯЩЕГО!
public class Table {
    private Shape[] table = new Shape[4];

    public Table() {
        super();
    }

    public Shape[] getTable() {
        return table;
    }

    public void setTable(Shape[] table) {
        this.table = table;
    }

    public void putShape(Shape fig) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                table[i] = fig;
                break;
            }
        }
    }

    public void delShape(Shape fig) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == fig) {
                table[i] = null;
            }
        }
    }

    public void infoTable() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                System.out.println(table[i]);
            } else {
                System.out.println("Free");
            }
        }
    }

    public double getArea() {
        double allArea = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                allArea = allArea + table[i].getArea();
            }
        }
        return allArea;
    }

    @Override
    public String toString() {
        return "Table [table area = " + getArea() + "]";
    }
}
