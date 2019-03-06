/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

/**
 *
 * @author Usuario
 */
public class Funciones {
    public static boolean expresion_regular_tarjeta_credito_debito(String cadena){
        String expresion_regular = "^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\ d{2}-?\\s?\\d{6}-?\\s?\\d{5}$";
        return cadena.matches(expresion_regular);
    }
    public static boolean expresion_regular_telefono(String cadena){
        String expresion_regular = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
        return cadena.matches(expresion_regular);
    }
    public static boolean expresion_regular_correo(String cadena){
        String expresion_regular = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$";
        return cadena.matches(expresion_regular);
    }
    /**
     * De esta forma comprobaremos:
     *  Contraseñas que contengan al menos una letra mayúscula.
     *  Contraseñas que contengan al menos una letra minúscula.
     *  Contraseñas que contengan al menos un número o caracter especial.
     *  Contraseñas cuya longitud sea como mínimo 8 caracteres.
     *  Contraseñas cuya longitud máxima no debe ser arbitrariamente limitada.
     * @param cadena
     * @return 
     */
    public static boolean expresion_reguar_seguridad_contrasena(String cadena){
    String exprecion_regular = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$ ";
    return cadena.matches(exprecion_regular);
    }
}
