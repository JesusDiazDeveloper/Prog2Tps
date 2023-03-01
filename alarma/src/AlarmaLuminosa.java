

public class AlarmaLuminosa extends Alarma{


    @Override
    public void comprobar() {
        if (vidrioRoto || accesoAbierto || movimiento) {
            //Timbre.hacerSonar();
            //Luz.encender();
        }
    }

}