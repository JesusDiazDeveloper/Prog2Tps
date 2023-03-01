package alarmaSensorial;
import java.util.ArrayList;

public class Alarma {
    protected ArrayList <Sensor> sensores;


    public Alarma () {
        sensores = new ArrayList <>();
    }

    

    public void comprobar() {
        for (Sensor s : sensores){
            if(s.comprobar()){
                //Luz.encender;
                System.out.println("La zona es: " + s.getZona() );

            }
        }
    }



public void agregarSensor (Sensor sensor ){
    if (!sensores.contains(sensor)){
        this.sensores.add(sensor);
    }
    else{
        System.out.println("Ya tenes ese sensor");// se que esto no va, es para probar.
    }
}

}