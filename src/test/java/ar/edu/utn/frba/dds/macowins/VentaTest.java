package ar.edu.utn.frba.dds.macowins;

import ar.edu.utn.frba.dds.macowins.prenda.Liquidacion;
import ar.edu.utn.frba.dds.macowins.prenda.Nueva;
import ar.edu.utn.frba.dds.macowins.prenda.Prenda;
import ar.edu.utn.frba.dds.macowins.prenda.Promocion;
import ar.edu.utn.frba.dds.macowins.venta.Fecha;
import ar.edu.utn.frba.dds.macowins.venta.Venta;
import ar.edu.utn.frba.dds.macowins.venta.VentaConTarjeta;
import org.junit.Test;

import static ar.edu.utn.frba.dds.macowins.prenda.TipoPrenda.*;
import static org.junit.Assert.assertEquals;

public class VentaTest {

    @Test
    public void elPrecioDeUnaventaDe3PrendasEnEfectivoEsLaSumaDeLosValoresDeCadaPrenda (){
        Prenda pantalonEnPromocion = new Prenda(1500,new Promocion(200),PANTALON);
        Prenda sacoEnLiquidacion = new Prenda(3000,new Liquidacion(),SACO);
        Prenda camisaNueva = new Prenda(4000,new Nueva(),CAMISA);

        Venta ventaEfectivo = new Venta(new Fecha(28,04,2021));
        ventaEfectivo.vender(pantalonEnPromocion,1);
        ventaEfectivo.vender(sacoEnLiquidacion,1);
        ventaEfectivo.vender(camisaNueva,1);

        assertEquals(ventaEfectivo.precio(), 6800, 0);

    }

    @Test
    public void elPrecioDe2CamisasConTarjetaEsLaSumaDelPrecioDeCadaPrendaMasElRecargo(){
        Prenda camisaNueva = new Prenda(5000,new Nueva(),CAMISA);
        Venta ventaConTarjeta = new VentaConTarjeta(new Fecha(12,02,2021),3,100);
        ventaConTarjeta.vender(camisaNueva,2);

        assertEquals( ventaConTarjeta.precio(), 10400, 0);
    }
}
