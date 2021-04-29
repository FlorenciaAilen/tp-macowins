package ar.edu.utn.frba.dds.macowins.venta;

import ar.edu.utn.frba.dds.macowins.prenda.Prenda;

public class Item{
    Prenda prenda;
    int cantidad;

    Item(Prenda prenda, int cantidad){
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public double precio(){
        return prenda.precio() * cantidad;
    }

}