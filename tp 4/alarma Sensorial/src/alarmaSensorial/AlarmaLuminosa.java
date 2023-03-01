package alarmaSensorial;

public class AlarmaLuminosa extends Alarma{


    @Override
    public void comprobar() {
        for (Sensor s : sensores){
            if (s.comprobar()){
                //Timbre.hacerSonar();
                //Luz.encender();
        }
        }
    }

}