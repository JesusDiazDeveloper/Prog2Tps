
public class CondicionNot extends Condicion {

	private Condicion condicionANegar;
	
	public CondicionNot(Condicion condicionANegar) {
		this.condicionANegar = condicionANegar;
	}
	
	@Override
	public boolean seCumple(Cliente cliente) {
		return !this.condicionANegar.seCumple(cliente);
	}

}
