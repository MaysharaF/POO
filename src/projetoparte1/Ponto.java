package projetoparte1;
public class Ponto {
    private  double x;
    private  double y;
    private  double z;
    
    //teste pull
    //construtor padrao 
    public Ponto(){
         x = 0;
         y = 0;
         z = 0;
    }
    //contrutor de incializacao
    public Ponto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
   //get e set de X
    public double getX(){
        return x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    //get e set de Y
    public double getY(){
        return y;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    //get e set de Z
    public double getZ(){
        return z;
    }
    
    public void setZ(double z){
        this.z = z;
    }
    
     public String getNome(){
        return "Ponto";
    }
    
    
    
    @Override
    public String toString(){
        return getNome() + "(" + getX() + "," +  getY() + ","  + getZ() +  ")";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return Double.doubleToLongBits(this.z) == Double.doubleToLongBits(other.z);
    }
    
    
    
    public double dist(Ponto p){
        System.out.println();
        return Math.sqrt(( Math.pow((p.getX() - this.getX()), 2) + Math.pow((p.getY() - this.getY()), 2) + Math.pow((p.getZ() - this.getZ()), 2)));
    }
    
    
}
