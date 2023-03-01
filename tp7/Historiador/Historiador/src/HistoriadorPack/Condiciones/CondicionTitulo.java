package HistoriadorPack.Condiciones;

import HistoriadorPack.Documento;

public class CondicionTitulo extends Condicion {
    
    private String titulo;

    public CondicionTitulo(String titulo){
        this.titulo = titulo;
    }

    public boolean seCumple (Documento doc){
        return this.titulo.equals(doc.getTitulo());
    }

}
