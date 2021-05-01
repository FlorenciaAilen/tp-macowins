package ar.edu.utn.frba.dds.macowins.venta;

import ar.edu.utn.frba.dds.macowins.prenda.Prenda;

public class Item{
    public Prenda prenda;
    public int cantidad;

    public Item(Prenda prenda, int cantidad){
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public double precio(){
        return prenda.precio() * cantidad;
    }

}