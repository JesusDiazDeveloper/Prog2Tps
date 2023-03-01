package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondicionAnd extends Condicion{
    private Condicion c1,c2;

    public CondicionAnd(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean seCumple (Pelicula p){
        return this.c1.seCumple(p)&&this.c2.seCumple(p);
    }

}
