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
public class Vehiculo {
    private String motor;
    private int cantidad_asientos;
    private int cantidad_timon; //o volante
    private String color;
    private int cantidad_tubo_escape;
    private String tipo_transmision;
    private String marca;    
    private String modelo;
    private String Matricula;
    private double capacidad_carga;

    public double getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(double capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCantidad_asientos() {
        return cantidad_asientos;
    }

    public void setCantidad_asientos(int cantidad_asientos) {
        this.cantidad_asientos = cantidad_asientos;
    }

    public int getCantidad_timon() {
        return cantidad_timon;
    }

    public void setCantidad_timon(int cantidad_timon) {
        this.cantidad_timon = cantidad_timon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad_tubo_escape() {
        return cantidad_tubo_escape;
    }

    public void setCantidad_tubo_escape(int cantidad_tubo_escape) {
        this.cantidad_tubo_escape = cantidad_tubo_escape;
    }

    public String getTipo_transmision() {
        return tipo_transmision;
    }

    public void setTipo_transmision(String tipo_transmision) {
        this.tipo_transmision = tipo_transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
}
