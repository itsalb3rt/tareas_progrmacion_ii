/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;

/**
 *
 * @author Usuario
 * Las clases abstractas son como un cuerpo, estas clases solo sirven para heredar 
 * no pueden crearse instancias
 */
abstract public class CajaTelenord {
    abstract public boolean Conectar();
    abstract public boolean Desconectar();
    abstract public boolean Suspender();
    abstract public boolean Activar();
    public String retornaAlgo(){
        return "Algo";
    }
}
