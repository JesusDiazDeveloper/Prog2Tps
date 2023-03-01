package Sueldos;

public class EmpleadoComision extends Empleado{
    private int comision = 10;
    private int ventas;

    public EmpleadoComision (String nombre, int salario, int ventas){
        super(nombre,salario);
        this.ventas = ventas;
    }

    public void setVentas(int ventas){
        this.ventas = ventas;
    }
    @Override
    public int getSalario(){
        return this.salario + this.ventas*this.comision ;
    }

}