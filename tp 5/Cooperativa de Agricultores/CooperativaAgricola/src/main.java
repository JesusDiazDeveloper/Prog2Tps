import java.util.ArrayList;

public class main {
    public static void main (String[]Args){
        Agricola agricola = new Agricola();
        Cereal c1 = new Cereal("c1");
        Cereal c2 = new Cereal("c2");
        Cereal c3 = new Cereal("c3");
        Cereal c4 = new Cereal("c4");
        Pastura p1 = new Pastura ("p1");
        Pastura p2 = new Pastura ("p2");
    
        agricola.addCereal(c4);
        agricola.addCereal(c3);
        agricola.addCereal(c2);
        agricola.addCereal(c1);
        c1.agregarMineral("maiz");
        agricola.addCereal(p1);
        agricola.addCereal(p2);



        Lote l1 = new Lote ();
        Lote l2 = new Lote ();
        Lote l3 = new Lote ();
        Lote l4 = new Lote ();
        Lote l5 = new Lote ();
        l1.addMineral("maiz");
        agricola.addLote(l5);
        agricola.addLote(l4);
        agricola.addLote(l3);
        agricola.addLote(l2);
        agricola.addLote(l1);
        
        
        ArrayList<String>resultado= agricola.CerealesParaElLote(l1);
        System.out.println(resultado);
    }

}
