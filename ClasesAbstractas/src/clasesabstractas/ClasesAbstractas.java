/**
 * 
 * La creacion de clases abstractas son como un una plantilla que ayuda a crear metodos 
 * que comunes que seran utilizados en el futuro.
 * Esto evita que en un equipo de programadores cada quien programa metodos que hace lo mismo
 * con diferente nombre
 * 
 * Las clases abstractas solo heredan no se pueden instanciar
 */
package clasesabstractas;

/**
 *
 * @author Usuario
 */
public class ClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CajaModelo100 caja = new CajaModelo100();
        
        if(caja.Conectar())
            System.out.println("Conectado");
        
    }
    
}
