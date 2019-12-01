package projetoparte1;
public class ProjetoParte1 {

    public static void main(String[] args) {
        
        //System.out.println(p1.equals(p2));
        //PontoXZ[] verts = {p1, p2, p3};
        
        //PoligonalFechada<PontoXZ> pol1 = new PoligonalFechada<>(verts);
        //System.out.println(String.format("Comprimento da poligonal = %f)", pol1.getComprimento()));
        
       // Poligonal<PontoXZ> pol2 = new Poligonal<>(verts);
       // System.out.println(String.format("Comprimento da poligonal = %f)", pol2.getComprimento()));
        // pontoXZ
        PontoXZ p1 = new PontoXZ(-3, 2);
        PontoXZ p2 = new PontoXZ(-3, 6);
        PontoXZ p3 = new PontoXZ(0, 2);
        System.out.println("Comprimento da Poligonal = "+p1.dist(p2));
        
        
        //PontoYZ
        PontoYZ P1 = new PontoYZ(2, 2);
        PontoYZ P2 = new PontoYZ(10, 2);
        PontoYZ P3 = new PontoYZ(10, 8);
        PontoYZ P4 = new PontoYZ(2, 8);
        System.out.println("Comprimento da poligonal fechada=" );
        
    }
       
        
    }
    
}
