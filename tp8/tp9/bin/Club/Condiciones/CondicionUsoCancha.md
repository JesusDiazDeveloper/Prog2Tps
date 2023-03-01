public class CondicionUsoCancha{
    private ID;

    public CondicionCancha (ID){
        this.ID = ID;
    }

    @Override
    public boolean seCumple(Socio s){
        return s.UsoCancha(ID);
    }
    
}