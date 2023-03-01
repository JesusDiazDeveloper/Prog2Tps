import java.util.ArrayList;

public class Combo extends ElementoPostal{
    
    private ArrayList <ElementoPostal> envios;
    

    public Combo(int numeroDeTracking){
        super(numeroDeTracking);
        this.envios = new ArrayList<>();
    }
    @Override
    public String getDestinatario(){
        return this.envios.get(0).getDestinatario();
    }
    @Override
    public String getRemitente(){
        return this.envios.get(0).getRemitente();
    }
    
    public void addElemento(ElementoPostal elemento){
        if(this.envios.isEmpty() || elemento.getCiudad().equals(this.getCiudad()))
        if(!envios.contains(elemento)){
            elemento.setNumeroDeTracking(this.getNumeroDeTracking());
            envios.add(elemento);
        }
    }
    @Override 
    public void setNumeroDeTracking(int numero){
        super.setNumeroDeTracking(numero);
        for (ElementoPostal elemento : envios){
            elemento.setNumeroDeTracking(numero);
        }
    }
    @Override 
    public String getCiudad(){
        return this.envios.get(0).getCiudad();
    }
    
    @Override
    public int getPeso() {
        int total = 0;
        for(ElementoPostal elemento : envios){
            total+=elemento.getPeso();
        }
        return total;
    }
    
            @Override
            public boolean equals(Object o1){
                try {
                    Combo c = (Combo)o1;
                    return this.getNumeroDeTracking()==(c.getNumeroDeTracking());
                } catch (Exception e) {
                    return false;
                }
            }
        }
        