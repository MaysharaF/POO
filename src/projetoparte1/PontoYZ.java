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

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public void setZ(double z) {
        this.z = z;
    }
     
    @Override
    public String toString(){
        return ("PontoXY = " + y + "," + z);
    }
}
