import java.util.ArrayList;

public class CasaDeComputacion {
    
    
	private ArrayList<Producto> productos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Proveedor> proveedores;
	private ArrayList<Empleado> empleados;


    public ArrayList<Cliente> buscar(Condicion cond) {
		ArrayList<Cliente> resultado = new ArrayList<>();
		
		for (int index = 0; index < this.clientes.size(); index++) {
			Cliente c = this.clientes.get(index);
			if (cond.seCumple(c)) {
				resultado.add(c);
			}
		}
		
		return resultado;
	}

    

}
