/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado_clases_internas;

/**
 *Agregarle los descuentos a la clase sueldo
 * agregar otra funcion "Imprimir Detalle de descuento".
 * Suelto Bruto -----
 * ARS ------
 * AFP ------
 * ISR ------
 * Otros ----
 * total descuento ----
 * Sueldo neto --------
 * @author Usuario
 */
public class Empleado {
  public String nombre = "";
  double tasa = 117.00;
  Direccion direccion; //cuando hay clases internas se declaran los objetos en la clase que las envuelve
  Sueldo sueldo;
  Isr isr;
  
  public Empleado (String unNombre, int numero, String unaCalle, String unaCiudad, double tasaHora, int horas){
      this.nombre = unNombre;
      this.tasa = tasaHora;
      direccion = new Direccion (numero, unaCalle, unaCiudad);
      sueldo = new Sueldo(horas);
  }
    //Clase interna
  /**
   * Esta clase se encarga de devolver la direccion en un formato adecuado
   */
  class Direccion{
      int numero = 0;
      String calle = "";
      String ciudad = "";
      
      Direccion (int num, String unaCalle, String unaCiudad){
          this.numero = num;
          this.calle = unaCalle;
          this.ciudad = unaCiudad;
      }
      void visualizarDetalles(){
      System.out.println(numero+" " + calle + ", "+ ciudad);
      }
  }
    /**
     * Clase interna que calcula el ISR
     */  
     class Isr{
         double salario;
         double baseImponible;
         double excedente;
         private double resultado_isr;
         
         //Constructor
        public Isr( double salario) {
            this.salario = salario*12;
        }       
        
        void salario (){
            System.out.println(salario);
        }
         double determinaPago(){
             //Si el salario es menor a 409,281.00 no debe pagar impuesto sobre la renta
            if ( salario  <= 409281.00){
                resultado_isr = 0.00;
            }else if  (( salario >= 409281.01) && ( salario <= 613921.00)) {
                   //Si el salario es mayor a 409,281.01 y menor que 613,921.00 paga un 15%
                   //Para la base imponible se le resta el exedente inferior al salario anual, lo mismo aplica para las demas 
                baseImponible = salario - 409281.01; 
                resultado_isr = determinaExcedente(baseImponible); 
            }else if ((salario >= 613921.01) && (salario <= 852667.00)){
                baseImponible = salario - 613921.01;
                resultado_isr = determinaExcedente(baseImponible);
            }else if ((salario >= 852667.01)){
                baseImponible = salario - 852667.01;
                resultado_isr = determinaExcedente(baseImponible);
            }
            
            return resultado_isr/12;
         }
         
         double determinaExcedente(double salario){
         if ((this.salario >= 409281.01) && (this.salario <= 613921.00))
        {
            excedente = (baseImponible * 0.15); //Se multiplica la baseimponible por 0.15 en este caso.
            //Retorna la multiplicacion a donde sea que se le lleme a esta funcion.
        }
        if ((this.salario >= 613921.01) && (this.salario <= 833171.00))
        {
            excedente = ((baseImponible * 0.20) + 30696.00);
        }
        if (this.salario >= 852667.00)
        {
            excedente = (baseImponible * 0.25) + 78446.00;
        }
        
        return excedente;
             }
         
        } 
  
    //Clase interna
     /**
      * Esta clase se encarga de calcular el sueldo y sus descuentos
      */
    class Sueldo{
    int horasTrabajadas = 0;
    
    void imprimir_Detalle_de_descuento(double sueldo){
        
        double sueldo_neto = sueldo;
        //Determinar ISR
        Isr determina_isr = new Isr(horasTrabajadas*tasa);
        double afp = sueldo * 2.87;
        double ars = 229.50;
        double sfs = sueldo * 3.04;
        double isr = determina_isr.determinaPago();   
        
        System.out.println("\nDescuentos".toUpperCase());
        System.out.println("AFP: RD$"+afp);
        System.out.println("ARS: RD$"+ars);
        System.out.println("SFS: RD$"+sfs);
        if(isr != 0){System.out.println("ISR: RD$"+isr);}
        System.out.println("\nSueldo Neto: RD$".toUpperCase()+((horasTrabajadas*tasa)-(afp+ars+sfs+isr)));              
    }
    Sueldo (int horas){
        horasTrabajadas = horas;
    }
    void visualizarDetalles(){
        System.out.println("Salario bruto = RD$"+horasTrabajadas*tasa);
    }
    }   
    
    void imprirmirDatos(){
        System.out.println(this.nombre);
        direccion.visualizarDetalles();
        sueldo.visualizarDetalles();
        sueldo.imprimir_Detalle_de_descuento(tasa);
    }
}
