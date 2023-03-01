import java.util.ArrayList;

public class Cereal{
    private String nombre;
    protected ArrayList <String> mineralesRequeridos;

    public Cereal (String nombre){
        this.nombre=nombre;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void agregarMineral(String mineral){
        if(!this.mineralesRequeridos.contains(mineral))
        this.mineralesRequeridos.add(mineral);
    }
    public ArrayList<String> getMinerales(){
        return new ArrayList <String> (this.mineralesRequeridos); 
    }
    public boolean leSirveLote(Lote lote){
        if(this.mineralesRequeridos.containsAll(lote.getMinerales()))
        return true;
        else
        return false;
    }

    public boolean equals(Object o1){
        try{
            Cereal c = ((Cereal) o1); // casteamelo a Cereal
            if(c.getNombre().equals(this.getNombre())) // hago la comparacion..
            return true;
            else 
            return false;
        }
        catch(Exception c){
            return false;
        }
    }
}