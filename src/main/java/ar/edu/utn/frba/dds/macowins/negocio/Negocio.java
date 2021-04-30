package ar.edu.utn.frba.dds.macowins.negocio;

//Macowins registra las ventas de estas prendas y necesita saber las ganancias de un determinado día.

import ar.edu.utn.frba.dds.macowins.venta.Fecha;
import ar.edu.utn.frba.dds.macowins.venta.Venta;

import java.util.ArrayList;
import java.util.List;

public class Negocio {
    List<Venta> ventas = new ArrayList<>();

    public double gananciasEnUnDia(Fecha fecha){
        return ventas.stream().filter(venta -> venta.getFecha() == fecha).mapToDouble(venta -> venta.precio()).sum();
    }

    public void ingresarVenta(Venta venta){
        ventas.add(venta);
    }

    public List<Venta> getVentas() {
        return ventas;
    }
}
