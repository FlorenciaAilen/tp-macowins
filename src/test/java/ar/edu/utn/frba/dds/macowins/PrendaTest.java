package ar.edu.utn.frba.dds.macowins;

import ar.edu.utn.frba.dds.macowins.prenda.Liquidacion;
import ar.edu.utn.frba.dds.macowins.prenda.Nueva;
import ar.edu.utn.frba.dds.macowins.prenda.Prenda;
import ar.edu.utn.frba.dds.macowins.prenda.Promocion;
import org.junit.Test;

import static ar.edu.utn.frba.dds.macowins.prenda.TipoPrenda.*;
import static org.junit.Assert.assertEquals;

public class PrendaTest {

  @Test
  public void elTipoDeUnaCamisaNuevaEsCAMISA() {
    Prenda camisaNueva = new Prenda(200,new Nueva(),CAMISA);

    assertEquals(camisaNueva.getTipoPrenda(), CAMISA);
  }

  @Test
  public void elTipoDeUnSacoEnLiquidacionEsSACO() {
    Prenda sacoEnLiquidacion = new Prenda(200,new Liquidacion(),SACO);

    assertEquals(sacoEnLiquidacion.getTipoPrenda(), SACO);
  }

  @Test
  public void elPrecioDeUnaCamisaNuevaEsSuPrecioBase() {
    Prenda camisaNueva = new Prenda(4000,new Nueva(),CAMISA);
    Prenda camisaNueva2 = new Prenda(5000,new Nueva(),CAMISA);

    assertEquals(camisaNueva.precio(), 4000, 0);
    assertEquals(camisaNueva2.precio(), 5000, 0);
  }

  @Test
  public void elPrecioDeUnSacoEnLiquidacionEsSuLaMitadDeSuPrecioBase() {
    Prenda sacoEnLiquidacion = new Prenda(3000,new Liquidacion(),SACO);
    Prenda sacoEnLiquidacion2 = new Prenda(8000,new Liquidacion(),SACO);

    assertEquals(sacoEnLiquidacion.precio(), 1500, 0);
    assertEquals(sacoEnLiquidacion2.precio(), 4000, 0);
  }

  @Test
  public void elPrecioDeUnPantalonEnPromocionEsSuPrecioBaseMenosSuDecuento() {
    Prenda pantalonEnPromocion = new Prenda(1500,new Promocion(200),PANTALON);
    Prenda pantalonEnPromocion2 = new Prenda(1500,new Promocion(100),PANTALON);

    assertEquals(pantalonEnPromocion.precio(), 1300, 0);
    assertEquals(pantalonEnPromocion2.precio(), 1400, 0);
  }
/*
  private Prenda pantalonEnPromocion(int precioBase, int descuento) {
    // TODO completar
    return null;
  }


  private Prenda camisaNueva(double precioBase) {
    // TODO completar
    return null;
  }

  private Prenda sacoEnLiquidacion(double precioBase) {
    // TODO completar
    return null;
  }


 */
}

