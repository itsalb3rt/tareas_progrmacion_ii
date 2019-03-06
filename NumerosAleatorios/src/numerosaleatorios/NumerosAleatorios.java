/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class NumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /* 
       Random random = new Random();
        
       System.out.println(random.nextInt());        
       System.out.println(random.nextInt(6)); // El numero maximo menos 1 se pasa como parametro a la funcion
        
        //Lanzamiento de 10 dados       
        for(int i = 0; i<=10;i++){
            System.out.println(random.nextInt(6)+1); // Factor de dimensionamiento
        }
     */
      Leidsa.quinielaPale();
      Leidsa.lotoPool();
      Leidsa.superKinoTV();
      Leidsa.pega3Mas();
      Leidsa.superLoto();
      Leidsa.lotto(true);
        
        //Estos numeros se generan entre mitad y mitad
        /*
        int numero = 0;
        int caras = 0;
        int escudos = 0;
        Random random = new Random();
        for(int i = 0; i<=10000; i++){
            numero = random.nextInt(2);
            if(numero==0) caras++;
            if(numero==1) escudos++;
            
        }
        System.out.println("caras: "+ caras+" Escudos: "+escudos);
        */
    }
    
}
