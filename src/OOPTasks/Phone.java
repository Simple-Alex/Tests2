package OOPTasks;

import java.util.Scanner;

public class Phone {
    public String type;
    public String model;
    public String number;
    Scanner sc = new Scanner(System.in);

    public Phone() {
        super();
    }

    public Phone(String type, String model, String number) {
        this.type = type;
        this.model = model;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void registration(){
        return;
    }
}
