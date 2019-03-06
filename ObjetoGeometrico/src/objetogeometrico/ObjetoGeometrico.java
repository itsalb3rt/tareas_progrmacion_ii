/*
 * Crear trigangulo, cuadrado, trapecio, rectangulo, circulo
 * Investigar como se calcula el perimetro
 */
package objetogeometrico;

/**
 *
 * @author Albert Edurdo Hidalgo Taveras
 */
public abstract class ObjetoGeometrico {
    
    private String nombre;
    
    public ObjetoGeometrico(String nombre){
        this.nombre = nombre;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    @Override
    public String toString(){
        return nombre;
    }
}
