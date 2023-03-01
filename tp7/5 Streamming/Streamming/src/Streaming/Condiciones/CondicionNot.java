package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondicionNot extends Condicion{
    private Condicion c1;

    public CondicionNot(Condicion c1){
        this.c1 = c1;
    }

    @Override
    public boolean seCumple(Pelicula p){
        return !c1.seCumple(p);
    }
}
