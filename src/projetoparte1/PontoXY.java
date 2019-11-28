package projetoparte1;
/**
 *
 * @author shen
 */
public class PontoXY extends Ponto2D {
    private double x;
    private double y;
    private double z;
    
    
    public PontoXY(double x, double y){
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
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
    public String toString(){
        return ("PontoXY = " + x + "," + y);
    }
}
