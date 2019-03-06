/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generar_tarjetas;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Numero de tarjetas que queremos
        int numero_tarjetas_generar = 5;
        String [] nuevastarjetas_validas = new String[numero_tarjetas_generar+1];
        String tarjetas_validas = "";
        Generar_tarjetas nuevatarjeta = new Generar_tarjetas();
        Validar_tarjeta validar = new Validar_tarjeta();
        int contador_total_iteraciones = 0;
        int contador_tarjetas_validas = 0;        
        //Indicar en el while cuantas tarjetas se quieren
        while(contador_tarjetas_validas <= numero_tarjetas_generar){
        String tarjeta_generada = "4";
            for(int i = 0; i<15;i++){            
                tarjeta_generada += Integer.toString(nuevatarjeta.generarAleatorio(1, 9));//Generando un nuevo numero                
            }            
                tarjetas_validas = validar.validar(tarjeta_generada);
                if(tarjetas_validas != "false" ){
                nuevastarjetas_validas[contador_tarjetas_validas] = tarjetas_validas;
                contador_tarjetas_validas++;
                }
                contador_total_iteraciones++;
        }
        for(String valor : nuevastarjetas_validas )
            System.out.println(valor);
        System.out.println("\nTotal intentos:"+contador_total_iteraciones + " Total aciertos: " + contador_tarjetas_validas);
        
    }
    
}
