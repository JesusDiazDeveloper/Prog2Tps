package Alarma;

public class AlarmaLuminosa extends Alarma {
	
	private Luz luz;
	
	public AlarmaLuminosa() {
		this.luz = new Luz();
	}
	
	public boolean comprobar() {
		if (this.rompioVidrio || this.abrioVentana || this.detectoMovimiento) 
			
			return this.nuevo.hacerSonar() && this.luz.encenderLuz();
			
		return false;
		
	}

}
