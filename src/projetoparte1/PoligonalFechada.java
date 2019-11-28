/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoparte1;

/**
 *
 * @author shen
 */
public class PoligonalFechada extends Poligonal {

    public PoligonalFechada(Ponto2D[] vertices) {
        super(vertices);
    }

    @Override
    public double getComprimento() {
        int ultimo = this.vertices.length - 1;
        return this.vertices[0].dist(this.vertices[ultimo]);
    }
}
