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
public class Rectangulo extends ObjetoGeometrico{

    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        super("Rectandulo");
        this.base = base;
        this.altura = altura;
    }   

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
       return ((base*altura)*2);
    }
    
}
