package ar.edu.utn.frba.dds.macowins.venta;

public class VentaConTarjeta extends Venta{
    private double coeficienteFijo;
    public int cantCuotas;

    public VentaConTarjeta(Fecha fecha,int cantCuotas, double coeficienteFijo) {
        super(fecha);
        this.cantCuotas = cantCuotas;
        this.coeficienteFijo = coeficienteFijo;
    }

    @Override
    public double precio(){
        return super.precio() + (coeficienteFijo * cantCuotas + super.precio() * 0.01);
    }
}
