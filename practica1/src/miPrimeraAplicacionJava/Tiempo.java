/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPrimeraAplicacionJava;

/**
 *
 * @author Usuario
 */
public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public int getHora() {return hora;}
    public int getMinuto() {return minuto;}
    public int getsegundo() {return segundo;}
    
    public Tiempo(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    
    public Tiempo (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto= minuto;
        this.segundo= segundo;
    }
    
    public void setHora (int hora)
    {
        this.hora = (hora>=0 && hora <=23) ? hora : 0;
    }
     public void setMinutos (int minuto)
    {
        this.minuto = (minuto>=0 && minuto <=59) ? minuto : 0;
    }
     
     public void setSegundo (int segundo)
    {
        this.segundo = (hora>=0 && hora <=59) ? segundo : 0;
    }
    
            
}
