package projetoparte1;
public class PontoYZ extends Ponto2D {
    private double xy;
    private double xz;
    private double yz;
    
    public PontoYZ(){
        xy = 0;
        xz = 0;
        yz = 0;
    }
    
    public PontoYZ(double xy, double xz, double yz){
        this.xy = xy;
        this.xz = xz;
        this.yz = yz;
    }
}
