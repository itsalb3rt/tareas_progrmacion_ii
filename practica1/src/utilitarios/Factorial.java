/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author Usuario
 */
public class Factorial {
    public static int calculaFactorial(int factorial){
        
        int r = factorial;        
        for(int i=1; factorial<=i ; i++){
            r=r*i;
        }
       return r;
}
}
