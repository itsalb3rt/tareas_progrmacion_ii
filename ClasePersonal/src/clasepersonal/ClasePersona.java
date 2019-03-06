/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepersonal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ClasePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Estudiante nuevo_estudiante = new Estudiante("100166816", "Lic. Informatica", 0.00, "Albert", "Hidalgo Taveras", "Masculino", "Empleado Privado","809-588-6178", "Soltero", "809-998-2632", "itsalb3rt@gmail.com");
        
        System.out.println("Balance actual: RD$"+nuevo_estudiante.getBalance());
        nuevo_estudiante.setBalance(250.09);
        System.out.println("Balance actual: RD$"+nuevo_estudiante.getBalance());
        */
        
        /* Comprar dos objetos para saber si son iguales */
        /*
        if(nuevoEstudiante.equals(nuePersona)){
            System.out.println("Ambos objetos son iguales");
        }else{
            System.out.println("Ambos objetos no son iguales");
        }
            
        */
        /**
         * creando un arreglo de tipo Estudiante
         * 
         * La clase persona en este caso tiene un constructor que recibe 2 parametros
         * el nombre y apellido
         */
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Albert","Hidalgo"));
        estudiantes.add(new Estudiante("Yanibel", "Ligne"));
        
        //Recorrer el arreglo para imprimirlo con un for mejorado
        for(Estudiante item:estudiantes){
        System.out.println(item.toString());
        }
        System.out.println("\n");
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Eduardo");
        nombres.add("Juan");
        nombres.add("Jose");
        for(String nombre: nombres){
            System.out.println(nombre);
        }
        System.out.println("\n");
        nombres.remove("Juan");
        for(String nombre: nombres){
            System.out.println(nombre);
        }
    }
    
}
