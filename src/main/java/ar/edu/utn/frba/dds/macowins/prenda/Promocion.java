package ar.edu.utn.frba.dds.macowins.prenda;

public class Promocion implements Estado {
    int descuento;

    public Promocion(int descuento) {
        this.descuento = descuento;
    }

    public double precio(double precioPropio) {
        return precioPropio - descuento;
    }
}
