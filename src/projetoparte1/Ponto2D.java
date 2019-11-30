package projetoparte1;
public abstract class Ponto2D extends Ponto{
    private double X;
    private double Y;
    private double Z;
    
    public Ponto2D(){}
    
    public Ponto2D(double X, double Y, double Z){
        this.Z = Z;
        this.Y = Y;
        this.X = X;
    }
    
    
    public Ponto2D(double Y, double Z){
        this.Z = Z;
        this.Y = Y;
        this.X = 0;
    }
    /*
    public Ponto2D(double Z, double Y){
        this.Z = Z;
        this.Y = Y;
        this.X = 0;
    }*/
      
}
