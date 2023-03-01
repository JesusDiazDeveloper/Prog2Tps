public class CondicionEdadMayorA extends Condicion {
    private int edad;

    public CondicionEdadMayorA(int edad){
        this.edad=edad;
    }

    @Override
    public boolean seCumple(Cliente cliente) {
        return cliente.getEdad()>(this.edad);
    }
    
}
