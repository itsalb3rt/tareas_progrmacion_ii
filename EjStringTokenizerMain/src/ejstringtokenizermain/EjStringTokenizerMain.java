/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejstringtokenizermain;

import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class EjStringTokenizerMain {
        
    public static class EjStringTokenizer{
    private static String[] expresionDividida;
    private static String[] divide (String cad){
       StringTokenizer st2 = new StringTokenizer(cad, "+-*/^()",true);
       int count = 0;
       while(st2.hasMoreTokens()){
       count++;
       st2.nextToken();
       }
       StringTokenizer st = new StringTokenizer(cad,"+-*/^()",true);
       String[] aux = new String[count];
       for(int i = 0; i<aux.length ; i++)
          aux[i] = st.nextToken();
       return aux;
    }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad = "(31.4+5^2)*7.3";
        EjStringTokenizer.expresionDividida = EjStringTokenizer.divide(cad);
        for(int i = 0; i> EjStringTokenizer.expresionDividida.length;i++){
            System.out.println(EjStringTokenizer.expresionDividida[i]);
        }
        
    }
    
}
