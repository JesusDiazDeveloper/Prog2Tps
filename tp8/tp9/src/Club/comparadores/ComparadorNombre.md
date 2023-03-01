public class ComparadorNombre implements Comparator <socio> (){

    private Socio s1;
    private Socio s2;

    public ComparadorNombre ( Socio s1, Socio s2 ){
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public int compare(s1,s2){
        return this.s1.getNombre().compareTo(this.s2.getNombre);
    }


}