package Alarma;

public class Alarma {
	
	protected boolean rompioVidrio;
	protected boolean abrioVentana;
	protected boolean detectoMovimiento;
	protected Timbre nuevo;
	
	public Alarma() {
		this.rompioVidrio = false;
		this.abrioVentana = false;
		this.detectoMovimiento = false;
		this.nuevo = new Timbre();
	}
	public boolean isRompioVidrio() {
		return rompioVidrio;
	}
	public void setRompioVidrio(boolean rompioVidrio) {
		this.rompioVidrio = rompioVidrio;
	}
	public boolean isAbrioVentana() {
		return abrioVentana;
	}
	public void setAbrioVentana(boolean abrioVentana) {
		this.abrioVentana = abrioVentana;
	}
	public boolean isDetectoMovimiento() {
		return detectoMovimiento;
	}
	public void setDetectoMovimiento(boolean detectoMovimiento) {
		this.detectoMovimiento = detectoMovimiento;
	}
	
	public boolean comprobar() {
		if (this.rompioVidrio || this.abrioVentana || this.detectoMovimiento) 
			
			return this.nuevo.hacerSonar();
			
		return false;
		
	}

}
