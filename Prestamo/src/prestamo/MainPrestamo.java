/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;
import prestamo.utilitario.utilitario;

/**
 *
 * @author Usuario
 */
public class MainPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prestamo prestamo = new Prestamo(115000, 15, 36);
        System.out.println("\033[37mCUOTA FIJA: " + utilitario.redondear(prestamo.getCuota_fija()));
        prestamo.printTablaAmortizacion();
        
    }
    
}
