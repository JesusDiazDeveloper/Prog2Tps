import java.util.ArrayList;

public class Agricola {
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;

    public Agricola (){
        this.cereales = new ArrayList <Cereal>();
        this.lotes= new ArrayList<>();
    }

    public ArrayList <String> CerealesParaElLote(Lote lote){
        ArrayList <String >resultado = new ArrayList<>();
        for (Cereal cereal : cereales){
            if (lote.esSembrable(cereal))
                resultado.add(cereal.getNombre());
        }
        return resultado;
    }
    public ArrayList <String> LotesParaSembrarEsteCereal(Cereal cereal){
        ArrayList <String> resultado = new ArrayList <>();
        for (Lote lote : lotes)
            if(cereal.leSirveLote(lote))
                lotes.add(lote);
        return resultado;
    }
    public void addCereal(Cereal c){
        if(!cereales.contains(c)){
            cereales.add(c);
        }
    }
    public void addLote(Lote lote ){
        if(!lotes.contains(lote)){
            lotes.add(lote);
        }
    }
}
