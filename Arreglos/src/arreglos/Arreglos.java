/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Ordena un arreglo de forma ascendente
         */
        double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(arregloDouble); //Ordenando de forma ascendente
        System.out.printf("\nArregloDouble: ");
        
        //For mejorado para escribir el arreglo en pantalla
        for (double valor : arregloDouble)
            System.out.printf("%.1f ", valor);
        System.out.println("\n");
        
        //Llenando arreglo de 10 elementos con 7
        int[] arregloIntLleno = new int[10];
        Arrays.fill(arregloIntLleno, 1);        
        mostrarArreglo(arregloIntLleno, "ArregloIntLleno");
      
    
    }
      //Imprime los valores en cada arreglo
        public static void mostrarArreglo (int [] arreglo, String descripcion){
            System.err.printf("\n%s: ",descripcion);
            
            for(int valor : arreglo)
                System.out.printf("%d",valor);
        }//Fin del metodo mostrarArreglo  
//Fin de la clase ManipulacionesArreglos
}
