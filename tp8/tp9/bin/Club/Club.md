public class club {
    private ArrayList <socio> socios;
    private int condicionEdad = 18;

    public club {
        this.socios = newArrayList <>();
    }

    public ArrayList <socio> listar(Condicion c, Comparator <socio> comp ){
        ArrayList<socio>resultado - new ArrayList <>();
        for(socio s : socios)
            if(c.seCumple(s))
                resultado.add(s)
        
        colections.sort(resultado , comp);

        return resultado
    }








    public ArrayList <socio> sociosMenoresDeEdad(){
        ArrayList<socio>resultado - new ArrayList <>();
        for(socio s : socios)
            if(s.getEdad()<condicionEdad)
                resultado.add(s)
        
        colections.sort(resultado , new comparadorEdad());

        return resultado

    }
    public ArrayList <socio> sociosQueAlquilaronCancha(int IDCancha){
        ArrayList<socio>resultado - new ArrayList <>();
        for(socio s : socios)
            if(s.alquiloAlgunaVez())
                resultado.add(s)
        
        colections.sort(resultado , new comparadorPorCantidad(IDCancha));

        return resultado

    }
}