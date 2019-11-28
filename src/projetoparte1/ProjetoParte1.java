package projetoparte1;
public class ProjetoParte1 {

    public static void main(String[] args) {
        /*PontoXZ p1 = new PontoXZ(-3.0, 2.0);
        PontoXZ p2 = new PontoXZ(-3.0, 6.0);
        PontoXZ p3 = new PontoXZ(0.0, 2.0);*/
        
        ///Ponto p1 = new Ponto(1,1,1);
        //Ponto p2 = new Ponto(1,0,1);
        
        //System.out.println(p1.equals(p2));
        //PontoXZ[] verts = {p1, p2, p3};
        
       // PoligonalFechada<PontoXZ> pol1 = new PoligonalFechada<>(verts);
        //System.out.println(String.format("Comprimento da poligonal = %f)", pol1.getComprimento()));
        
        //Poligonal<PontoXZ> pol2 = new Poligonal<>(verts);
        //System.out.println(String.format("Comprimento da poligonal = %f)", pol2.getComprimento()));
        
        PontoXZ p1 = new PontoXZ(-3, 2);
        PontoXZ p2 = new PontoXZ(-3, 6);
        PontoXZ p3 = new PontoXZ(0, 2);
        
        System.out.println(p1.dist(p2));
        
       
    }
    
}
