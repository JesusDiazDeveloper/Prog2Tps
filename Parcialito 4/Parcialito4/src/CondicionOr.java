public class CondicionOr extends Condicion{
    Condicion cond1, cond2;

    public CondicionOr(Condicion c1, Condicion c2){
        cond1 = c1;
        cond2 = c2;
    }

    @Override
    public boolean seCumple(Cliente cliente) {
        return cond1.seCumple(cliente) || cond2.seCumple(cliente);
    }
}