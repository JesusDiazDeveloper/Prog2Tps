public class Carta extends ElementoPostal {
    
    private Persona destinatario;
    private Persona remitente;
    private boolean retiranEnSucursal;
    private int peso;
    public Carta(int numeroDeTracking, Persona destinatario, Persona remitente, boolean retiranEnSucursal, int peso) {
        super(numeroDeTracking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.retiranEnSucursal = retiranEnSucursal;
        this.peso = peso;
    }




    public String getDestinatario() {
        return destinatario.getNombre();
    }
    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }
    public String getRemitente() {
        return remitente.getNombre();
    }
    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }
    public boolean retiranEnSucursal() {
        return retiranEnSucursal;
    }
    public void setDondeLaRetiran(boolean retiranEnSucursal) {
        this.retiranEnSucursal = retiranEnSucursal;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String getCiudad() {
        return this.destinatario.getCiudad();
    }

}
