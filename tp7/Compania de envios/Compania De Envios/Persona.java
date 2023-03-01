public class Persona {
    private String direccion;
    private String ciudad;
    private String Nombre;

    public Persona(String direccion, String ciudad, String nombre) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        Nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
}
