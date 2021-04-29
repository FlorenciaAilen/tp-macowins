package ar.edu.utn.frba.dds.macowins.prenda;

public class Liquidacion implements Estado {
    public double precio(double precioPropio) {
        return precioPropio * 0.5;
    }
}
