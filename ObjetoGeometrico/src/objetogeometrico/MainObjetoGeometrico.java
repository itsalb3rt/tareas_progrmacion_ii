/**
*El área de un trapecio se calcula a partir de su altura y los dos lados 
* paralelos (a y b) o bases del trapecio. Es el resultado de multiplicar
* su altura (h) y la mediana del trapecio, que se obtiene como la media 
* de las dos bases a y b: M=(a+b)/2.
 */
package objetogeometrico;

/**
 *
 * @author Usuario
 */
public class MainObjetoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cuadrado nuevoCuadrado = new Cuadrado(4, 8);
        System.out.println(nuevoCuadrado.toString());
        System.out.println("Area: "+nuevoCuadrado.calcularArea());
        System.out.println("Perimetro: "+nuevoCuadrado.calcularPerimetro()+"\n");
        
        Trapecio nueTrapecio = new  Trapecio(6, 3, 4);
        System.out.println(nueTrapecio.toString());
        System.out.println(nueTrapecio.calcularArea()+" cm2"+"\n");
        
        Rectangulo nuevoRectangulo = new Rectangulo(4, 6);
        System.out.println(nuevoRectangulo.toString());
        System.out.println("Area: " + nuevoRectangulo.calcularArea());
        System.out.println("Perimetro: " + nuevoRectangulo.calcularPerimetro()+"\n");
        
        Circulo circulo = new Circulo(3);
        System.out.println(circulo.toString());
        System.out.println("Perimetro: "+circulo.calcularArea());
        System.out.println("Area: "+circulo.calcularPerimetro()+"\n");
        
        Triangulo nuevoTriangulo = new Triangulo();
        nuevoTriangulo.setTipo_triangulo("escaleno");
        System.out.println(nuevoTriangulo.getTipo_triangulo().toUpperCase());
        nuevoTriangulo.setLadoA(2.24);
        nuevoTriangulo.setLadoB(2.83);
        nuevoTriangulo.setLadoC(1);
        System.out.println(nuevoTriangulo.calcularArea()+"\n");
        
        
        Triangulo perimetroTriangulo = new Triangulo();
        perimetroTriangulo.setLadoA(2);
        perimetroTriangulo.setLadoB(4);
        perimetroTriangulo.setLadoC(3);
        perimetroTriangulo.setTipo_triangulo("escaleno");
        System.out.println(perimetroTriangulo.toString()+" "+perimetroTriangulo.getTipo_triangulo());
        System.out.println(perimetroTriangulo.calcularPerimetro()+"\n");
    }
    
}
