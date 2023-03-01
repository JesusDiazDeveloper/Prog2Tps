package HistoriadorPack.Condiciones;
import HistoriadorPack.Documento;

public class CondicionNot extends Condicion{
    public Condicion c1;

    public CondicionNot (Condicion c1){
        this.c1 = c1;
    }

    @Override
    public boolean seCumple(Documento doc){
        return !c1.seCumple(doc);
    }

    
}
