/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetogeometrico;

/**
 *
 * @author Albert Edurdo Hidalgo Taveras
 */
public class Cuadrado extends ObjetoGeometrico{
    private double area_conocida;
    private double lado_conocido;

    public Cuadrado(double area_conocida, double lado_conocido) {
        super("Cuadrado");
        this.area_conocida = area_conocida;
        this.lado_conocido = lado_conocido;
    }

    public double getArea_conocida() {
        return area_conocida;
    }

    public void setArea_conocida(double area_conocida) {
        this.area_conocida = area_conocida;
    }

    public double getLado_conocido() {
        return lado_conocido;
    }

    public void setLado_conocido(double lado_conocido) {
        this.lado_conocido = lado_conocido;
    }

    @Override
    public double calcularArea() {
        return Math.pow(area_conocida,2);
    }

    @Override
    public double calcularPerimetro() {
        return lado_conocido * 4;
    }
    
    
}
