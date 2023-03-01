

public class AlarmaLuminosa extends Alarma{

    protected Luz luz;

    @Override
    public void comprobar() {
        if (vidrioRoto || accesoAbierto || movimiento) {
            timbre.sonar();
            luz.encender();
        }
    }

}