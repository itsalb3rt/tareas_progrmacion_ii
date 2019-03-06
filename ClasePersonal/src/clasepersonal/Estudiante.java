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
public class Estudiante extends Persona{
    
    private String matricula;
    private String carrera;
    private double balance;    
     
    public Estudiante(){}    
    public Estudiante(String nombre, String apellido){
        super(nombre, apellido);
    }    
    
    public Estudiante(String matricula, String carrera, double balance, String nombre, String apellido, String sexo, String ocupacion, String telefono, String estadoCivil, String telefono_celular, String email) {
        super(nombre, apellido, sexo, ocupacion, telefono, estadoCivil, telefono_celular, email);
        this.matricula = matricula;
        this.carrera = carrera;
        this.balance = balance;
    }   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }    
    
}
