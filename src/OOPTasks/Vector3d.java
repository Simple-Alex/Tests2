package OOPTasks;

public class Vector3d {
    private double vectorX1;
    private double vectorY1;
    private double vectorZ1;
    private double vectorX2;
    private double vectorY2;
    private double vectorZ2;

    public Vector3d() {
        super();
    }

    public Vector3d(double vectorX1, double vectorY1, double vectorZ1, double vectorX2, double vectorY2, double vectorZ2) {
        this.vectorX1 = vectorX1;
        this.vectorY1 = vectorY1;
        this.vectorZ1 = vectorZ1;
        this.vectorX2 = vectorX2;
        this.vectorY2 = vectorY2;
        this.vectorZ2 = vectorZ2;
    }

    public double getVectorX1() {
        return vectorX1;
    }

    public void setVectorX1(double vectorX1) {
        this.vectorX1 = vectorX1;
    }

    public double getVectorY1() {
        return vectorY1;
    }

    public void setVectorY1(double vectorY1) {
        this.vectorY1 = vectorY1;
    }

    public double getVectorZ1() {
        return vectorZ1;
    }

    public void setVectorZ1(double vectorZ1) {
        this.vectorZ1 = vectorZ1;
    }

    public double getVectorX2() {
        return vectorX2;
    }

    public void setVectorX2(double vectorX2) {
        this.vectorX2 = vectorX2;
    }

    public double getVectorY2() {
        return vectorY2;
    }

    public void setVectorY2(double vectorY2) {
        this.vectorY2 = vectorY2;
    }

    public double getVectorZ2() {
        return vectorZ2;
    }

    public void setVectorZ2(double vectorZ2) {
        this.vectorZ2 = vectorZ2;
    }
    public String vectorsSum(){
        double vectorX = vectorX1 + vectorX2;
        double vectorY = vectorY1 + vectorY2;
        double vectorZ = vectorZ1 + vectorZ2;
        return "x1= "+vectorX + ", y1= "+ vectorY+", z1= "+vectorZ;
    }
    public String vectorDecrease(){
        double vectorX = vectorX1 - vectorX2;
        double vectorY = vectorY1 - vectorY2;
        double vectorZ = vectorZ1 - vectorZ2;
        return "x1= "+vectorX + ", y1= "+ vectorY+", z1= "+vectorZ;
    }

    //пусть угол будет = 0
    public double scalaryMultiplication(){
        double vectorLength1 = Math.pow(vectorX1,2)+Math.pow(vectorY1,2)+Math.pow(vectorZ1,2);
        double vectorLength2 = Math.pow(vectorX2,2)+Math.pow(vectorY2,2)+Math.pow(vectorZ2,2);
        double vector1 = vectorLength1*vectorLength2;
        return vector1;
    }

    @Override
    public String toString() {
        return "Vector3d : " + vectorsSum()
                + ", vectorDecrease: " + vectorDecrease()
                +", scalyarMultiplication: "+scalaryMultiplication();
    }
}
