/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.math.BigInteger;

/**
 *
 * @author Usuario
 */
public class Factorial {

    /**
     *Factorial con numeros grandes, sin limites
     * @param factorial
     * @return 
     */    
    public static BigInteger calculaFactorial (int factorial){
         BigInteger f = new BigInteger("1");
    for (int i = 1; i <= factorial; i++) {
        f = f.multiply(new BigInteger(i + ""));
    }
    return f;
    }
    
    /**
     * Factorial con numeros pequenos (menos de 31)
     * @param factorial
     * @return 
     */
    public static int calculaFactorial2(int factorial){
        
        int r = factorial;        
        for(int i=1; i<= factorial ; i++){
            r=r*i;
        }
       return r;
}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(calculaFactorial(1000000));
     
}
}
