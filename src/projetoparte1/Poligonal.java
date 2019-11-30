package projetoparte1;

/**
 *
 * @author shen
 * @param <T>
 */
public class Poligonal<T extends Ponto2D> {

    private T[] vertices;
    

    public Poligonal(T[] vertices) {
        if (vertices.length < 2) {
            throw new IllegalArgumentException("Poligonal deve ter ao menos dois vértices");
        } else {
            this.vertices = vertices;
        }
    }

    public int getN() {
        return this.vertices.length;
    }

    public T getVertice(int i) {
        if (i < 0 || i > this.vertices.length) {
            return null;
        }
        return this.vertices[i];
    }

    public T setVertice(int i, T vertice) {
        if (i < 0 || i > this.vertices.length) {
            return null;
        }
        return this.vertices[i] = vertice;
    }

    public double getComprimento() {
        double res = 0;
        int ultimo = this.vertices.length - 1;
        //aberta
        for(int i = 0; i <= ultimo; i++)
            res += this.vertices[i].dist(this.vertices[i+1]);
        return res;
    }
}
