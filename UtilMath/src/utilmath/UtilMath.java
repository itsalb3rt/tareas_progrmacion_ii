/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilmath;

/**
 *
 * @author Usuario
 */
public class UtilMath {
    
    public static double AreaTrigangulo(int base, int altura){
        return base*altura;
    }
    
    public  static double potencia(int base, int potencia){
        double f = 1;
        
        for(int i = 1; i<=potencia; i++){
        f*=base;
       
    }
         return f;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        utilmath.UtilMath.AreaTrigangulo(32,23);
        
        
        System.out.println(UtilMath.AreaTrigangulo(23, 23));
    }
    
}
