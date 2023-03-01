import java.util.ArrayList;

public class Enfermedad{
    private String nombre;
    private ArrayList <String> EstadosPatologicosQueTiene;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        this.EstadosPatologicosQueTiene = new ArrayList <>();
    }
    
    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList(EstadosPatologicosQueTiene);
    }
    public boolean equals (Object o1){
        try{
            Enfermedad e = ((Enfermedad) o1);
            return this.nombre.equals(e.getNombre());

        }
        catch(Exception e ){
            return false;
        }
    }
    public String getNombre(){
        return this.nombre;
    }
}


