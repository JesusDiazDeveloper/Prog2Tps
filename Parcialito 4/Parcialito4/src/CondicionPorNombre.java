public class CondicionPorNombre extends Condicion {
    private String nombreQueBusco;

    public CondicionPorNombre(String nombre){
        this.nombreQueBusco=nombre;
    }

    @Override
    public boolean seCumple(Cliente cliente) {
        return cliente.getNombre().equals(nombreQueBusco);
    }
    
}
