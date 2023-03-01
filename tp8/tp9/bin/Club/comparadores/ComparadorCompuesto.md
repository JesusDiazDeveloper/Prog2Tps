public class ComparadorCompuesto implements Comparator <Socio>{

    private Comparator <Socio> comp1;
    private Comparator <Socio> comp2;

    public ComparadorCompuesto(Comparator <Socio> c1; Comparator <Socio> c2){
        comp1 = c1;
        comp2 = c2;
    }

    @Override
    public int compare(Socio s1, Socio s2){
        int resultado = comp1.compare(s1,s2);
        if(resultado == 0)
            comp2.compare(s1,s2)
        
    return resultado
    }



}