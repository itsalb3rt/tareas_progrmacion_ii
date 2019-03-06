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
public class Barco extends Vehiculo{
    private int cantidad_chimenea;
    private int cantidad_helice;
    private int cantidad_ancla;

    public int getCantidad_chimenea() {
        return cantidad_chimenea;
    }

    public void setCantidad_chimenea(int cantidad_chimenea) {
        this.cantidad_chimenea = cantidad_chimenea;
    }

    public int getCantidad_helice() {
        return cantidad_helice;
    }

    public void setCantidad_helice(int cantidad_helice) {
        this.cantidad_helice = cantidad_helice;
    }

    public int getCantidad_ancla() {
        return cantidad_ancla;
    }

    public void setCantidad_ancla(int cantidad_ancla) {
        this.cantidad_ancla = cantidad_ancla;
    }
    
}
