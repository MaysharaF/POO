package projetoparte1;
/**
 *
 * @author shen
 * @param <T>
 */
public class PontoXZ<T extends Ponto2D >{
    private double xy;
    private double xz;
    private double yz;
    
    
    public PontoXZ(){
        xy = 0;
        xz = 0;
        yz = 0;
    }
    
    public PontoXZ(double xy, double xz, double yz){
        this.xy = xy;
        this.xz = xz;
        this.yz = yz;
    }

    PontoXZ(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
