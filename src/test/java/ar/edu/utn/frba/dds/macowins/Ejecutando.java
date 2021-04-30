package ar.edu.utn.frba.dds.macowins;

import ar.edu.utn.frba.dds.macowins.negocio.Negocio;
import ar.edu.utn.frba.dds.macowins.prenda.Liquidacion;
import ar.edu.utn.frba.dds.macowins.prenda.Nueva;
import ar.edu.utn.frba.dds.macowins.prenda.Prenda;
import ar.edu.utn.frba.dds.macowins.prenda.Promocion;
import ar.edu.utn.frba.dds.macowins.venta.Fecha;
import ar.edu.utn.frba.dds.macowins.venta.Venta;

import static ar.edu.utn.frba.dds.macowins.prenda.TipoPrenda.*;

public class Ejecutando {
    static void main(String[] args) {
        Prenda pantalonEnPromocion = new Prenda(1500, new Promocion(200), PANTALON);
        Prenda sacoEnLiquidacion = new Prenda(3000, new Liquidacion(), SACO);
        Prenda camisaNueva = new Prenda(4000,new Nueva(),CAMISA);

        Venta venta1 = new Venta(new Fecha(10, 05, 2021));
        venta1.vender(pantalonEnPromocion, 1);

        Venta venta2 = new Venta(new Fecha(10, 05, 2021));
        venta2.vender(sacoEnLiquidacion, 2);

        Venta venta3 = new Venta(new Fecha(11, 05, 2021));
        venta3.vender(camisaNueva, 2);

        Negocio macowins = new Negocio();
        macowins.ingresarVenta(venta1);
        macowins.ingresarVenta(venta2);
        macowins.ingresarVenta(venta3);

        Fecha fechaDeHoy = new Fecha(10, 05, 2021);

        macowins.getVentas();

    }

}
