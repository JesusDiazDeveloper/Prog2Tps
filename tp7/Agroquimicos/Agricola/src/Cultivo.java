import java.util.ArrayList;

public class Cultivo {
    private String nombre; 
    private ArrayList <Enfermedad>EnfermedadesFrecuentes;

    public Cultivo (String nombre ){
        this.nombre = nombre;
        this.EnfermedadesFrecuentes = new ArrayList<>();
    }

    public boolean leSirveProducto(Producto producto){
        return producto.trataAunqueSeaUnaEnfermedad
        (new ArrayList<>(EnfermedadesFrecuentes))
        && !producto.seDesaconsejaCultivo(this);
    }

    public void addEnfermedadFrecuente(Enfermedad e){
        if(!EnfermedadesFrecuentes.contains(e)){
            EnfermedadesFrecuentes.add(e);
        }
    }

    public boolean equals (Object o1){
        try {
            Cultivo c = ((Cultivo)o1);
            return this.getNombre().equals(c.getNombre());
        }
        catch(Exception e){
            return false;
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
