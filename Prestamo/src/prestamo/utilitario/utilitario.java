/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.utilitario;

import java.math.BigDecimal;

/**
 *
 * @author Usuario
 */
public class utilitario {
    
    /**
     * Este metodo de utiliza para redondear el resultado de los calculos
     * ya que estos devuelven por si solos numeros reales muy grandes 
     * @param valor
     * @return 
     */
    public static double redondear(double valor){
        double resultado;
        BigDecimal res; //Objeto para redondear decimales
        int decimales = 2; //Cantidad de decimales que se quiere 
        
        res = new BigDecimal(valor).setScale(decimales, BigDecimal.ROUND_UP); //Operacion
        resultado = res.doubleValue(); //Obteniendo el valor double
        return resultado;
    }
}
