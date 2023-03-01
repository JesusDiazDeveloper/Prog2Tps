package Alarma;

public class main {

	public static void main(String[] args) {
		
		Alarma ala = new Alarma();
		AlarmaLuminosa alu = new AlarmaLuminosa();
		
		ala.setAbrioVentana(false);
		ala.setRompioVidrio(false);
		ala.setDetectoMovimiento(true);
		
		alu.setAbrioVentana(false);
		alu.setRompioVidrio(true);
		alu.setDetectoMovimiento(false);
		
		boolean estado = ala.comprobar();
		boolean estadoLuz = alu.comprobar();
		
		System.out.println(estado);
		System.out.println(estadoLuz);
		
		

	}

}
