package projetoparte1;

/**
 *
 * @author shen
 * @param <T>
 */
public class PoligonalFechada<T extends Ponto2D> extends Poligonal<T> {

    public PoligonalFechada(T[] vertices) {
        super(vertices);
    }

    @Override
    public double getComprimento(){
        double res = super.getComprimento();
        int ultimo = this.getN() - 1;
        return res+= this.getVertice(0).dist(this.getVertice(ultimo));
    }
}
