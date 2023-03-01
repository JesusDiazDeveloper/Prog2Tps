package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondicionAnioMenor extends Condicion{
    private int anioMaximo;

    public CondicionAnioMenor(int anioMaximo){
        this.anioMaximo = anioMaximo;
    }

    @Override
    public boolean seCumple (Pelicula p ){
        return this.anioMaximo>p.getAnioDeEstreno();
    }
}
