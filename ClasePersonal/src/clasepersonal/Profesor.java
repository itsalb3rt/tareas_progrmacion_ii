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
public class Profesor extends Persona{
    
    private double salario;
    private String area; //are a la que pertence, ejemplo: Facultad ciencia, artes, educacion

    /* Constructores */
    
    public Profesor(){}

    public Profesor(double salario, String area) {
        this.salario = salario;
        this.area = area;
    }

    public Profesor(double salario, String area, String nombre, String apellido, String sexo, String ocupacion, String telefono, String estadoCivil, String telefono_celular, String email) {
        super(nombre, apellido, sexo, ocupacion, telefono, estadoCivil, telefono_celular, email);
        this.salario = salario;
        this.area = area;
    }
    
    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
