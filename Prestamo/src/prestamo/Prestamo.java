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
public class Prestamo {
    private double monto_prestamo;
    private double tasa_interes; //expresado en poercentaje
    private double tiempo; //Tiempo de prestamo en meses
    private double cuota_fija;   
    private double amortizacion;
    private double capital_amortizado;
    private double interes; //Interes del prestamo
    
    public void setMonto_prestamo(double monto_prestamo){
        this.monto_prestamo = monto_prestamo;
    }
    
    public double getMonto_Prestamo(){
        return monto_prestamo;
    }
    
    public void setTasa_interes(double tasa_interes){
        this.tasa_interes = tasa_interes;
    }
    
    public double getTasa_interes(){
         return tasa_interes;
    }
    
    public void setTiempo(double tiempo){
        this.tiempo = tiempo;
    }
    
    public double getTiempo(){
    return tiempo;
    }
    
    public Prestamo(double monto_prestamo, double tasa_interes, double tiempo) {
        this.monto_prestamo = monto_prestamo;
        this.tasa_interes = (tasa_interes/100)/12; //Convirtiendo a porciento a un interes anual
        this.tiempo = tiempo;
    }
    
    public double getCuota_fija() {
        cuota_fija = monto_prestamo * ((tasa_interes * Math.pow(1 + tasa_interes, tiempo)) / (Math.pow(1 + tasa_interes, tiempo)-1));
        return cuota_fija;
    }

    public double getInteres(double monto) {
        return utilitario.redondear(monto * tasa_interes);
    }

    public double getTotalInteresPrestamo(){
    
    return getInteres(monto_prestamo)*tiempo;
    };

    /**
     *Imprime la tabla que contiene
     * no. pago
     * fecha de pago
     * cuto
     * capital
     * interes
     * balance
     */
    public void printTablaAmortizacion(){
    double valor_cuota_fija = getCuota_fija();
    double saldo_al_capital = monto_prestamo;
    Double[] arregloDouble = new Double[100];
    int numero = 1;
    capital_amortizado = monto_prestamo;
        System.out.println("\033[32mNo.   "+" Capital      " + "Interes    " + " Amortizacion   "+"Cuto fija    ");
        for(int i = 0 ; i < tiempo; i++){        
            amortizacion = getCuota_fija() - getInteres(capital_amortizado);
            capital_amortizado -= amortizacion;
            System.out.println(numero+"-     " + utilitario.redondear(capital_amortizado) +"      "+  getInteres(capital_amortizado)  + "       " + utilitario.redondear(amortizacion)   + "        " +utilitario.redondear(getCuota_fija()));

            numero ++;
        }    
    }    
}
