package HistoriadorPack.Condiciones;
import HistoriadorPack.Documento;

public class CondicionAnd extends Condicion{
    private Condicion c1,c2;

    public CondicionAnd (Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean seCumple (Documento doc){
        return this.c1.seCumple(doc) && this.c2.seCumple(doc);
    }

}
