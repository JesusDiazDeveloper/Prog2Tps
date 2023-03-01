

public class Sitio{

    private ArrayList <Elemento> elementos;

    public Sitio (){
        this.elementos =  new ArrayList <>();
    }

    public ArrayList <Elemento> obtenerMapa(){
        ArrayList <Elemento> resultado : new ArrayList <>();
        For (Elemento e : elementos){
            resultado.addAll(e.obtenerMapa());
        }
        
        return resultado; 
    }

}