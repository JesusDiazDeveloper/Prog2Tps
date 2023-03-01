import java.util.ArrayList;

public class Lote {
    private ArrayList <String> minerales;
    private int tamanio;
    

    public Lote(){
        this.minerales = new ArrayList<String>();
    } 



    
    public void addMineral(String mineral){
        if(!this.minerales.contains(mineral)){
            this.minerales.add(mineral);
        }
    }
    public int getTamanio(){
        return this.tamanio;
    }

    public boolean isSpecial(ArrayList <String> minerales){
        
        for(String mineral : minerales){
            if(!this.minerales.contains(mineral)){
                return false;
            }
        }
        return true;
    }
    public boolean esSembrable(Cereal cereal){
        if(this.minerales.containsAll(cereal.getMinerales()))
            return true;
        else
            return false;
    }
    public ArrayList <String> getMinerales(){
        return new ArrayList <String> (this.minerales);
    }

}
