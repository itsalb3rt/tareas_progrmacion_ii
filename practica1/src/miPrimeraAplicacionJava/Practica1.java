/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPrimeraAplicacionJava;
import utilitarios.Fecha;
import java.util.Scanner;
/**
 * @author Usuario
 */
public class Practica1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Objeto de tipo tiempo que ofrece hora, minutos y segundos */
        Tiempo t = new Tiempo(18,30,45);       
        System.out.println("Hora " + t.getHora() + " minutos " + t.getMinuto() + " segundos " + t.getsegundo());
        
        /* Leer datos del usuario */
        
        /**
         *Se importa el paquete Scanner para utilizar la introduccion de datos al sistema
         * se crea un objeto de tipo scanner que recibira los parametro
         * se utliza el metodo nextInt() para asignar el valor ingresado anteriormente en la variable deseada
         */
        Scanner leer = new Scanner(System.in);
        int ano,mes,dia;        
        System.out.println("Ingrese el ano: ");
        ano = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia:");
        dia = leer.nextInt();
        
        /* FIN Leer datos del usuario */
        /* Objeto de tipo Fecha que ofrece dia, mes y anio de un paquete llamado utilitarios  */
        Fecha f = new Fecha(); 
        f.setAno(ano);
        f.setMes(mes);
        f.setDia(dia);
        System.out.println("Dia " + f.getDia() + " mes " + f.getMes() + " anio " + f.GetAno());
        /* Verifica si el ano es bisiesto */
        System.out.println(f.esBisiesto());
        
        
        Double db1 = new Double("232.23");
        double db2 = db1.doubleValue(); /*Obtener el valor del objeto anteriormente creado*/
        
        Integer entero = new Integer(123);
        int valor = entero.intValue();/*Obtener el valor del objeto anteriormente creado*/
        
        int oValor = Integer.parseInt("233");
        
        double obj = 231;
        
        System.out.println(oValor);
        
        /* Si al declarar un tipo de dato double, float, long, etc y se da error se 
        debe colocar la unicial dle tipo de dato al final de la cifra por ejemplo
        double d = 23.34d;
        float f = 23.23f; 
        */
    }
    
}
