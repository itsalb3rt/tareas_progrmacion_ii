/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejando_cadenas;


/**
 *
 * @author Usuario
 */
public class Manejando_cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena = "Albert Eduardo Hidalgo Taveras";
       String cadena2 = "Albert Eduardo Hidalgo Taveras";
       
       for(int i = 0; i<cadena.length();i++)
            System.out.print(cadena.charAt(i)); //CharAt devuelve la posicion que se le indique
       
       String [] a = cadena.split(" "); //Crea un arreglo de string
       for(String valor: a)
            System.out.println(valor);
       
       //Ahorrando memoria pasando directamente la cadena y cortandola en un for mejorado
       for(String valor: cadena.split(" "))
            System.out.println(valor);
       
       if(cadena.equals(cadena2))//comparando cadenas
           System.out.print("\nEs igual\n");
       
       String universidad = "Universidad-Autonoma-de-Santo-Domingo";
        System.out.println(universidad.split("-").length);
        System.out.println(universidad.replace("-", "&"));
        universidad = universidad.replace("-", "&");
        System.out.println(universidad);
        universidad = universidad.replace("&", "-");
        System.out.println(universidad);
        System.out.println(universidad.substring(universidad.indexOf("Universidad"), universidad.indexOf("-")));
        //indexOf devuleve un entero con la posicion de lo que le pases
        
        //Encontrar ultimo index
        System.out.println(universidad.lastIndexOf("-"));
        
        String email = "itsalb3rt@gmail.com";
        //La expresion regular se busca en http://regexlib.com/
        if(email.matches("^((([!#$%&'*+\\-/=?^_`{|}~\\w])|([!#$%&'*+\\-/=?^_`{|}~\\w][!#$%&'*+\\-/=?^_`{|}~\\.\\w]{0,}[!#$%&'*+\\-/=?^_`{|}~\\w]))[@]\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)$"))
            System.out.println("El correo es valido");
        
        String cedula = "056-0173604-3";
        //Expresion regular para la cedula
        if(cedula.matches("^(\\d{3}-\\d{7}-\\d{1})$"))
            System.out.println("La cedula es valida");
    }
    
}
