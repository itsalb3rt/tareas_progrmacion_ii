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
public class Trapecio extends ObjetoGeometrico{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    private double altura;
    /**
     * Este constructor se utiliza para el calculo del area, de esta manera recibimos menos parametros
     * @param ladoA
     * @param ladoB
     * @param altura 
     */
    public Trapecio(double ladoA,double ladoB, double altura){
        super("Trapecio");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
    }
    /**
     * Este constructor se utiliza para recibie los 4 ladros de un trapacio y asi calcular el perimetro
     * @param ladoA
     * @param ladoB
     * @param ladoC
     * @param ladoD 
     */
    public Trapecio(double ladoA, double ladoB, double ladoC, double ladoD){
        super("Trapacio");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return ((ladoA+ladoB)/2)*altura;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC + ladoD;
    }
    
}
