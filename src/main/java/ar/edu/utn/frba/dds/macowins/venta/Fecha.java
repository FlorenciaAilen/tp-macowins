package ar.edu.utn.frba.dds.macowins.venta;

public class Fecha {
    public int dia;
    public int mes;
    public int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
}
