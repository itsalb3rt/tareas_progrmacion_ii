/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author Usuario
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
     
        /* For mejorado con un arreglo de string  */
        String[] cadena = new String[]{"ALbert","Hidalgo","Taveras"};      
        
        for(String valor : cadena){
            System.out.println(valor);
        }
        /* FIN For mejorado con cadena  */        
        
        /* For mejorado con entero  */
        
        int [] arregloInt = {87,88,40,20,98};
                
         int total = 0;         
         for ( int numero : arregloInt){             
             total += numero;
             System.out.println(numero);
         }
         
         System.out.println("suma arreglo "+total);
         
         /* For mejorado con entero  */
}

}
