package projetoparte1;
/**
 *
 * @author shen
 */
public class PontoXY extends Ponto2D {
    private double xy;
    private double xz;
    private double yz;
    
    
    public PontoXY(){
        xy = 0;
        xz = 0;
        yz = 0;
    }
    
    public PontoXY(double xy, double xz, double yz){
        this.xy = xy;
        this.xz = xz;
        this.yz = yz;
    }
    
    /**
     *
     * @return 
     */
    @Override
    public String toString(){
        return ("PontoXY = " + xy + "," + xz);
    }
}
