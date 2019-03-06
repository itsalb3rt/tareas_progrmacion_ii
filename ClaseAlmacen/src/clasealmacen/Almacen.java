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
public class Almacen {
    private Object [] listaObjetos;
    private int numeroElementos = 0;
    
    Almacen (int maxElementos){
        listaObjetos = new Object[maxElementos];
    }
    
    public Object get(int i){
        return listaObjetos[i];
    }
    public  void add(Object obj){
        listaObjetos[numeroElementos++] = obj;
    }
    public Iterador gerIterador(){
        return  new Iterador();
    }
    
    class Iterador{
        int indices = 0;
        Object siguiente(){
            if(indices < numeroElementos)
                return listaObjetos[indices++];
                        else
                            return null;
        }
    }
}
