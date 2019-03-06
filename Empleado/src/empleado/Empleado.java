/*
 * Clase internas
 */
package empleado;

/**
 *
 * @author Usuario
 */
public class Empleado {

  public String nombre = "";
  double tasa = 16.00;
  Direccion direccion; //cuando hay clases internas se declaran los objetos en la clase que las envuelve
  Sueldo sueldo;
  
  public Empleado (String unNombre, int numero, String unaCalle, String unaCiudad, double tasaHora, int horas){
      this.nombre = unNombre;
      this.tasa = tasaHora;
      direccion = new Direccion (numero, unaCalle, unaCiudad);
      sueldo = new Sueldo(horas);
  }
    //Clase interna
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
    //Clase interna
  
    class Sueldo{
    int horasTrabajadas = 0;
    
    Sueldo (int horas){
        horasTrabajadas = horas;
    }
    void visualizarDetalles(){
        System.out.println("Salario = "+horasTrabajadas*tasa);
    }
    }   
    
    void imprirmirDatos(){
        
    }
}

