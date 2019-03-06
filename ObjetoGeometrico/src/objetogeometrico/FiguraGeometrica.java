/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetogeometrico;

/**
 *
 * @author Usuario
 */
public interface FiguraGeometrica {
    
    public static final int MENOR = 1;
    public static final int IGUAL = 0;
    public static final int MAYOR = -1;
    public int comparar(FiguraGeometrica figura);
    
}
