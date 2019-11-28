package projetoparte1;
public class PontoYZ extends Ponto2D {
    private double x;
    private double y;
    private double z;
    
     public PontoYZ(double y, double z){
        this.x = 0;
        this.y = y;
        this.z = z;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
     
    @Override
    public String toString(){
        return ("PontoXY = " + y + "," + z);
    }
}
