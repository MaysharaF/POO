package projetoparte1;
/**
 *
 * @author shen
 */
public class PontoXZ extends Ponto2D{
    private double x;
    private double y;
    private double z;

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public void setZ(double z) {
        this.z = z;
    }
    
    

    public PontoXZ(double x, double z){
        this.x = x;
        this.y = 0;
        this.z = z;
    }
    @Override
    public String toString(){
        return ("PontoXY = " + x + "," + z);
    }
}
