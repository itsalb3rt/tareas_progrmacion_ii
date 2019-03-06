/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sillas_avion;

/**
 *
 * @author Usuario
 */
public class Sillas_avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public boolean hayDosSillasVaciasMismaUbicacion()
{
    boolean existe = false;
        int SILLAS_EJECUTIVAS = 0;
    for(int i = 0; i < SILLAS_EJECUTIVAS && !existe; i++){
        for(int j = 0; j < SILLAS_EJECUTIVAS && !existe; j++){
            if(sillasEjecutivas[i].darNumero() != sillasEjecutivas[j].darNumero()){
               if(sillasEjecutivas[i].darUbicacion() == sillasEjecutivas[j].darUbicacion()){
                  return existe = true;
               }
            }
        }
    }
    for(int i = 0; i < SILLAS_ECONOMICAS && !existe; i++){
        for(int j = 0; j < SILLAS_ECONOMICAS && !existe; j++){
            if(sillasEconomicas[i].darNumero() != sillasEconomicas[j].darNumero()){
               if(sillasEconomicas[i].darUbicacion() == sillasEconomicas[j].darUbicacion()){
                  return existe = true;
               }
            }
        }
    }
       return existe;         

}
    }
    
}
