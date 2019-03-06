/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetogeometrico;

import java.math.BigDecimal; //Importado para redondear numeros reales

/**
 *
 * @author Usuario
 */
public class Circulo extends ObjetoGeometrico{
    
    private double radio_diametro;
    
    public Circulo() {
        super("Circulo");
    }

    public Circulo(double radio_diametro) {
        super("Circulo");
        this.radio_diametro = radio_diametro;
    }

    public double getRadio_diametro() {
        return radio_diametro;
    }

    public void setRadio_diametro(double radio_diametro) {
        this.radio_diametro = radio_diametro;
    }    
    
    @Override
    public double calcularArea() {
        double resultado;
        BigDecimal res; //Objeto para redondear decimales
        int decimales = 2; //Cantidad de decimales que se quiere

        res = new BigDecimal(Math.PI*(Math.pow(radio_diametro, 2))).setScale(decimales, BigDecimal.ROUND_UP); //Operacion
        resultado = res.doubleValue(); //Obteniendo el valor double
        return resultado; 
    }

    @Override
    public double calcularPerimetro() {
        
        double resultado;
        BigDecimal res; //Objeto para redondear decimales
        int decimales = 2; //Cantidad de decimales que se quiere

        res = new BigDecimal(Math.PI*radio_diametro).setScale(decimales, BigDecimal.ROUND_UP); //Operacion
        resultado = res.doubleValue(); //Obteniendo el valor double
        return resultado;
    }
    
}
