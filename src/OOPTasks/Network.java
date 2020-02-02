package OOPTasks;

import java.util.Scanner;

public class Network {

    private long num1;
    private long num2;
    private long num3;
    private long num4;

    public Network() {
        super();
    }

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }

    public long getNum3() {
        return num3;
    }

    public void setNum3(long num3) {
        this.num3 = num3;
    }

    public long getNum4() {
        return num4;
    }

    public void setNum4(long num4) {
        this.num4 = num4;
    }

    //что с long-ом?? !
    public void phoneNumbers() {
        num1 = 1593697539;
        num2 = 1473691597;
        num3 = 2134642135;
        num4 = 1654654654;
    }
    public void registrationNum(){
        Phone phoneNum = new Phone();
        phoneNum.registration();
    }
}
