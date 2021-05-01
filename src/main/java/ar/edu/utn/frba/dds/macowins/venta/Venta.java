package ar.edu.utn.frba.dds.macowins.venta;

/*“Cada venta tiene asociada las prendas que se vendieron, su cantidad y la fecha de venta.
Las ventas pueden ser en efectivo o con tarjeta. En el caso que sea con tarjeta, tienen el mismo comportamiento
que en efectivo (el cual no modifica el precio), sólo que se le aplica un recargo según la cantidad de cuotas
seleccionadas (cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda).”
*/

import ar.edu.utn.frba.dds.macowins.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    public Fecha fecha;
    public List<Item> items = new ArrayList<>();

    public Venta(Fecha fecha){
        this.fecha = fecha;
    }

    public double precio(){

        return items.stream().mapToDouble(item -> item.precio()).sum();
    }

    public void vender(Prenda prenda, int cantidad){
        items.add(new Item(prenda,cantidad));
    }

    public List<Item> getItems() {

        return items;
    }

    public Fecha getFecha() {

        return fecha;
    }
}

