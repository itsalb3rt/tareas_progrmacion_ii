/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitario;

/**
 *
 * @author Usuario
 */
public class Utilitario {
    
    public boolean aceptar_solo_texto(char caracter){
        if((caracter<'a' || caracter>'z') && (caracter<'A' || caracter>'Z') && caracter != ' ')
            return true;
        else
            return false;
    }
}
