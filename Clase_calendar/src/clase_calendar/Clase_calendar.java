/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*Una funcion que diga el dia y mes en letra en el que nacio la persona 
*clase fecha que reciba los datos
 */
package clase_calendar;
import java.text.DateFormat;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Clase_calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date hoy = new Date();
        System.out.println(hoy); //Imprimirendo la fecha actual en formato Mon Oct 30 08:29:17 GMT-04:00 2017
        
        DateFormat formato = DateFormat.getDateInstance(DateFormat.LONG,Locale.ENGLISH); // Fecha en formato October 30, 2017
        System.out.println(formato.format(hoy));        
        
        formato = DateFormat.getDateInstance(DateFormat.SHORT,Locale.ENGLISH); //Fecha en formato 10/30/17
        System.out.println(formato.format(hoy));
        
        Calendar cal = Calendar.getInstance();
        cal.set(1993,5,9); //Pasando fech
        /*
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2017, 10,30);
        
        int diferencia = cal.get(Calendar.DAY_OF_YEAR)-cal2.get(Calendar.DAY_OF_YEAR);
        if(diferencia>0)
            System.out.println("Faltan " + diferencia + " dias");
        if(diferencia == 0)
            System.out.println("Felicidades");
        if(diferencia<0)
            System.out.println("Su cumpleanos fue hace " + Math.abs(diferencia)+ " dias");
        */
        System.out.println(cal.getWeekYear());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));        
        
    }
    
}
