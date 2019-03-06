/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_datos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Entrada_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /**
         *Se importa el paquete Scanner para utilizar la introduccion de datos al sistema
         * se crea un objeto de tipo scanner que recibira los parametro
         * se utliza el metodo nextInt() para asignar el valor ingresado anteriormente en la variable deseada
         */
        Scanner leer = new Scanner(System.in);
        int a,b;        
        System.out.println("El valor de a: ");
        a = leer.nextInt();
        System.out.println("El valor de b: ");
        b = leer.nextInt();
        System.out.println("La suma es:" + (a+b));
        
        
    }
    
}
