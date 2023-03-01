import java.util.ArrayList;

public class Agricola {
    private ArrayList<Producto> productos;

    public Agricola() {
        this.productos = new ArrayList<>();
    }
    
    public ArrayList<Producto> productosParaEnfermedad(Enfermedad e){
        ArrayList <Producto> resultado = new ArrayList<>();
        for( Producto producto : productos){
            if(producto.trataEnfermedad(e)){
                resultado.add(producto);
            }
        }
        return resultado;

    }


    public ArrayList <Producto> ProductosParaCultivoSegunEnfermedad (Enfermedad e , Cultivo c){
        ArrayList <Producto> resultado = new ArrayList<>();
        for (Producto prod : this.productos){
            if(prod.trataCultivoSegunEnfermedad(c, e))
                resultado.add(prod);
        }
        return resultado;
    }
}