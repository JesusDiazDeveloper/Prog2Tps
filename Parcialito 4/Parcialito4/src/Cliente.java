import java.util.ArrayList;

public class Cliente {
    

    private String nombre;
    private String apellido;
    private int edad ;
    private ArrayList<String> preferencias;


    public ArrayList<String> getPreferencias() {
		return new ArrayList<>(preferencias);   
    }

    public boolean tienePreferencia ( String pref){
        return this.preferencias.contains(pref); 
    }


    public Cliente(String nombre, String apellido, int edad, ArrayList<String> preferencias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.preferencias = preferencias;
    }

	

    
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }   
 
}
