package HistoriadorPack;
import java.util.ArrayList;

import HistoriadorPack.Condiciones.Condicion;

public class ColeccionDeDoc{

    private ArrayList<Documento>documentos;

    public ColeccionDeDoc (){
        this.documentos = new ArrayList<>();
    }

    public  ArrayList <Documento> buscar (Condicion condicion){
        ArrayList<Documento> resultado = new ArrayList<>();
        for(Documento documento : this.documentos){
            if(condicion.seCumple(documento)){
                resultado.add(documento);
            }
        }
        return resultado;
    }
} 