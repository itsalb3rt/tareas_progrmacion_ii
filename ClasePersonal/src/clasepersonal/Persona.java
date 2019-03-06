/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepersonal;

/**
 *
 * @author Usuario
 */
public class Persona {
 /**\
  * Crear la clase persona completa
  * crear clase empleado, profesor y heredar de persona
  * Crear clase vehiculo, para heradar a carro, motocicleta, barco, camioneta
  */
    private String nombre;
    private String apellido;
    private String sexo;
    private String ocupacion;
    private String telefono;
    private String estadoCivil;
    private String telefono_celular;
    private String email;

    Persona() {}
    Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    }
    
    public Persona(String nombre, String apellido, String sexo, String ocupacion, String telefono, String estadoCivil, String telefono_celular, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.telefono_celular = telefono_celular;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefonoCelular() {
        return telefono_celular;
    }

    public void setTelefonoCelular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
       
}
