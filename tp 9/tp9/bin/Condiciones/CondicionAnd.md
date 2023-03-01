

public class CondicionAnd Extends Condicion{

    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2){
        this.c2 = c2;
        this.c1 = c1;
    }

    @Override
    public boolean seCumple(Noticia n){
        return c1.seCumple(n) && c2.seCumple(n);
    }
}