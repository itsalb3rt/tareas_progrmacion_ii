/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevehiculo;

/**
 *
 * @author Usuario
 */
public class Carro extends Vehiculo{
    
    private int cantidad_parabrisas;
    private int cantidad_faroles_traseros;
    private int cantidad_faroles_delanteros;
    private int cantidad_puertas;
    private int cantidad_bolsas_aire;
    private int cantidad_cinturon_seguridad;
    private int cantidad_ruedas;
    private int cantidad_limpiaparabrisas; 
    private String tipo_traccion;

    public int getCantidad_parabrisas() {
        return cantidad_parabrisas;
    }

    public void setCantidad_parabrisas(int cantidad_parabrisas) {
        this.cantidad_parabrisas = cantidad_parabrisas;
    }

    public int getCantidad_faroles_traseros() {
        return cantidad_faroles_traseros;
    }

    public void setCantidad_faroles_traseros(int cantidad_faroles_traseros) {
        this.cantidad_faroles_traseros = cantidad_faroles_traseros;
    }

    public int getCantidad_faroles_delanteros() {
        return cantidad_faroles_delanteros;
    }

    public void setCantidad_faroles_delanteros(int cantidad_faroles_delanteros) {
        this.cantidad_faroles_delanteros = cantidad_faroles_delanteros;
    }

    public int getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(int cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    public int getCantidad_bolsas_aire() {
        return cantidad_bolsas_aire;
    }

    public void setCantidad_bolsas_aire(int cantidad_bolsas_aire) {
        this.cantidad_bolsas_aire = cantidad_bolsas_aire;
    }

    public int getCantidad_cinturon_seguridad() {
        return cantidad_cinturon_seguridad;
    }

    public void setCantidad_cinturon_seguridad(int cantidad_cinturon_seguridad) {
        this.cantidad_cinturon_seguridad = cantidad_cinturon_seguridad;
    }

    public int getCantidad_ruedas() {
        return cantidad_ruedas;
    }

    public void setCantidad_ruedas(int cantidad_ruedas) {
        this.cantidad_ruedas = cantidad_ruedas;
    }

    public int getCantidad_limpiaparabrisas() {
        return cantidad_limpiaparabrisas;
    }

    public void setCantidad_limpiaparabrisas(int cantidad_limpiaparabrisas) {
        this.cantidad_limpiaparabrisas = cantidad_limpiaparabrisas;
    }

    public String getTipo_traccion() {
        return tipo_traccion;
    }

    public void setTipo_traccion(String tipo_traccion) {
        this.tipo_traccion = tipo_traccion;
    }
     
    
}
