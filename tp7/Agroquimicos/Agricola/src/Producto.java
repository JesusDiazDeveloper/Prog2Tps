import java.util.ArrayList;

public class Producto {
    private String nombre ;
    private ArrayList <Cultivo> cultivosDesaconsejados; 
    private ArrayList <String> EstadosPatologicosQueTrata; 

    public Producto (String nombre){
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.EstadosPatologicosQueTrata = new ArrayList <>();
    }

    public boolean trataCultivoSegunEnfermedad (Cultivo c, Enfermedad e){
        if(this.trataEnfermedad(e)&&!this.seDesaconsejaCultivo(c)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean trataEnfermedad(Enfermedad e){
        return this.EstadosPatologicosQueTrata.containsAll(e.getEstadosPatologicos());
        
    }

    public boolean trataAunqueSeaUnaEnfermedad(ArrayList<Enfermedad>ArregloDeEnfermedades){
        for (Enfermedad enfermedad : ArregloDeEnfermedades){
            if(this.trataEnfermedad(enfermedad))
                return true;
        }
        return false;
    }
    public boolean seDesaconsejaCultivo(Cultivo c){
        return cultivosDesaconsejados.contains(c);
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + "]";
    }



}
