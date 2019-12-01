package projetoparte1;
public abstract class Ponto2D extends Ponto{
    private double x;
    private double y;
    private double z;
    
    public Ponto2D(){}
    
    public Ponto2D(double X, double Y, double Z){
        this.z = z;
        this.y = y;
        this.x = x;
    }
    
    
    public Ponto2D(double Y, double Z){
        this.z = z;
        this.y = y;
        this.x = 0;
    }
    /*
    public Ponto2D(double Z, double Y){
        this.Z = Z;
        this.Y = Y;
        this.X = 0;
    }*/
      
}
