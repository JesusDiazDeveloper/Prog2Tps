public class Pastura extends Cereal {
    private int restriccionPorTamanio = 50;

    public Pastura(String nombre) {
        super(nombre);
    }

    @Override
    public boolean leSirveLote(Lote lote) {
        if (this.mineralesRequeridos.containsAll(lote.getMinerales()) && (restriccionPorTamanio < lote.getTamanio()))
            return true;
        else
            return false;
    }
}
