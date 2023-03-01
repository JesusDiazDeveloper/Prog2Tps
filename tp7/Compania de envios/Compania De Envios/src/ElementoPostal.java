public abstract class ElementoPostal {

    protected int numeroDeTracking;

    // constructor para que todos tengan numero de tracking
    public ElementoPostal(int numero) {
        this.numeroDeTracking = numero;
    }

    public void setNumeroDeTracking(int numero){
        this.numeroDeTracking = numero;
    }

    public int getNumeroDeTracking(){
        return this.numeroDeTracking;
    }

    public abstract int getPeso();

    public abstract String getDestinatario();

    public abstract String getRemitente();

    public abstract String getCiudad();

}