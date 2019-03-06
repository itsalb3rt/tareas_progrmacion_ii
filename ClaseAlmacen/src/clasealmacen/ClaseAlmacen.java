/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasealmacen;

/**
 *
 * @author Usuario
 */
public class ClaseAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Almacen alm = new Almacen(10); //Se crea un nuevo almacen
       alm.add(20); //Se agregan objetos
       alm.add(30);
       
       //Para recorreglo
       Almacen.Iterador i = alm.gerIterador();//Obtengo un interador para alm
       /* "Almacen.Iterador" indica que es una clase dentro de otra ya que se necesita acceder
       a ella por medio de la clase que le envuelve
       */
       Object o = new Object();
       while((o = i.siguiente()) != null){
           System.out.println(o.toString());
       }
       
    }
    
}
