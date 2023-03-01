package Sueldos;

public class EmpleadoExtras extends Empleado{
    private int valorDeHoras = 300;
    protected int hsExtras;
    
    public EmpleadoExtras(String nombre ,int salario,  int hsExtras) {  
            super(nombre, salario);
            this.hsExtras = hsExtras;
    }   

    @Override
    public int getSalario() {
        return this.salario + this.hsExtras*valorDeHoras;
    }


    

    

    

}