/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejstringtokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class EjStringTokenizer {

        public class ejStringtokenizerf{
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       private static String[] expresionDividida;
       private static String[] divide (String cad){
           StringTokenizer st2 = new StringTokenizer(cad, "+- */^()",true);
           int count = 0;
           while(st2.hasMoreTokens()){
           count++;
           st2.nextToken();
           }
           StringTokenizer st = new StringTokenizer(cad,"+- */^()",true);
           String[] aux = new String[count];
           for(int i = 0; i<aux.length ; i++)
              aux[i] = st.nextToken();
           return aux;
    }
    
}
