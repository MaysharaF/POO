package projetoparte1;

public class Retangulo<T extends Ponto2D> extends Poligono<T> {
    private double base;
    private double altura;
    
    /**
     *
     * @param vertices
     */
    public Retangulo(T[] vertices) {
        double res = 0;
        if (vertices.length < 4) {
            throw new IllegalArgumentException("Retângulo deve ter quatro vértices");
        } else {
            this.vertices = vertices;
        }
      base = vertices[0].dist(vertices[1]);
      altura = vertices[0].dist(vertices[3]);
    }
    
    
    public double getBase(){    
        return base;
    }
    
    public double getAltura() {
        return altura;
    }

    public double getPerimetro() {
        double res = 0;
        res= 2 *(this.base + this.altura);
        return res;
    }
    
    public double getArea(){
        double res = 0;
        res = (this.base * this.altura);
        return res;
    }
    
    
}
