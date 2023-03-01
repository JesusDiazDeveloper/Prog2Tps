import java.util.ArrayList;
import java.util.Collections;

public class Puerto {

    private ArrayList  <Barco> barcos;
    private ArrayList  <Camion> camiones;


    public Puerto() {
        this.barcos = new ArrayList<>();
        this.camiones = new ArrayList<>();
    }

    public void addBarco (Barco b){
        if(!barcos.contains(b)){
            this.barcos.add(b);
            Collections.reverse(barcos);
        }
    }
    public void addCamion (Camion b){
        if(!camiones.contains(b)){
            this.camiones.add(b);
            Collections.sort(camiones);
        }
    }
    public ArrayList <Barco> getBarcos(){
        return new ArrayList <>(barcos);
    }
    public ArrayList <Camion> getCamiones(){
        return new ArrayList <>(camiones);
    }
    public Barco cargarBarco(){
        this.barcos.get(0).ejecutar();
        return this.barcos.remove(0);
    }

    

}
