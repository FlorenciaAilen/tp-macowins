package ar.edu.utn.frba.dds.macowins.prenda;

public class Prenda {
    double precioPropio;
    Estado estado;
    TipoPrenda tipoPrenda;

    public Prenda(double precioPropio, Estado estado, TipoPrenda tipoPrenda){
        this.precioPropio = precioPropio;
        this.estado = estado;
        this.tipoPrenda = tipoPrenda;
    }

    public double precio(){

        return estado.precio(precioPropio);
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public double getPrecioPropio() {
        return precioPropio;
    }

    public Estado getEstado() {
        return estado;
    }
}

