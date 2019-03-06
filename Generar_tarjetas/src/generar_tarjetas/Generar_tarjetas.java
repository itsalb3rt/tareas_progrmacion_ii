/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generar_tarjetas;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Generar_tarjetas {
     public int generarAleatorio(int min, int max){
         //Recibe 2 parametros, desde el inicio por ejemplo 1 y el final por ejemplo 9
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
    
}
