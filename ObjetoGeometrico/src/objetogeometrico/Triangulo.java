/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package objetogeometrico;

import java.math.BigDecimal;

/**
 *
 * @author Albert Edurdo Hidalgo Taveras
 */
public class Triangulo extends ObjetoGeometrico{
    
    private double base;
    private double altura;
    private String tipo_triangulo;
    private double ladoA;
    private double LadoB;
    private double LadoC;
    
    //Constructores
   public Triangulo(){
   super("Triangulo");
   }
   /**
    * Este constructor se utiliza para el calculo con la ecuacion general 
    * cuando se conoce la altura y cualquiera de los lados
    * @param base
    * @param altura 
    */
   public Triangulo(double base, double altura){
        super("Trigangulo");
        this.base = base;
        this.altura = altura;
    }
    // FIN Constructores
   
    public String getTipo_triangulo() {
        return tipo_triangulo;
    }

    public void setTipo_triangulo(String tipo_triangulo) {
        this.tipo_triangulo = tipo_triangulo;
    }     
   
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }

    public double getLadoC() {
        return LadoC;
    }

    public void setLadoC(double LadoC) {
        this.LadoC = LadoC;
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
    
    /**
     * Este metodo de utiliza para redondear el resultado de los calculos
     * ya que estos devuelven por si solos numeros reales muy grandes 
     * @param valor
     * @return 
     */
    private double redondear(double valor){
        double resultado;
        BigDecimal res; //Objeto para redondear decimales
        int decimales = 2; //Cantidad de decimales que se quiere 
        
        res = new BigDecimal(valor).setScale(decimales, BigDecimal.ROUND_UP); //Operacion
        resultado = res.doubleValue(); //Obteniendo el valor double
        return resultado;
    }
    /**
     * Calcula el area del triangulo Equilatero, Isosceles y Escaleno
     * Se recomiendo utlizar los set para pasar los valores ya que no en todos
     * los casos se requiere ntodos los lados del triangulo
     * @return 
     */
    @Override
    public double calcularArea() {
               
        double resultado = 0; 
        double semiPerimetro; //Se utiliza para el calculo del triangulo escaleno
        
        if(null != tipo_triangulo)switch (tipo_triangulo) {
            case "equilatero":
                //equilatero  requiere 1 solo lado
                resultado = (Math.sqrt(3)/4)*Math.pow(ladoA, 2);
                resultado = redondear(resultado);
                break;
            case "isosceles":
                //Isosceles requiere 1 lado que sea igual a otro lado y el lado desigual
                resultado = (LadoB * (Math.sqrt(Math.pow(ladoA, 2)-(Math.pow(LadoB, 2)/4))/2) );
                resultado = redondear(resultado);
                break;
            case "escaleno":
                //Escaleno conociendo los 3 lados formula de heron:
                semiPerimetro = (ladoA+LadoB+LadoC)/2;
                resultado = Math.sqrt(semiPerimetro*((semiPerimetro-ladoA)*(semiPerimetro-LadoB)*(semiPerimetro-LadoC)));
                resultado = redondear(resultado);
                break;
            default:
                break;
        }
        return resultado;
    }

    @Override
    public double calcularPerimetro() {
        double resultado = 0; 
        
        if(null != tipo_triangulo)switch (tipo_triangulo) {
            case "equilatero":
                //equilatero  requiere 1 solo lado
                resultado = 3 * ladoA;
                resultado = redondear(resultado);
                break;
            case "isosceles":
                //Isosceles requiere 1 lado que sea igual a otro lado y el lado desigual
                resultado = 2 * ladoA + LadoB;
                resultado = redondear(resultado);
                break;
            case "escaleno":
                //Escaleno conociendo los 3 lados formula de heron:
                resultado = ladoA + LadoB + LadoC;
                resultado = redondear(resultado);
                break;
            default:
                break;
        }
        return resultado;
    }
    
}
