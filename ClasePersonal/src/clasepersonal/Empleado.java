/*
 * Albert Eduardo Hidalgo Taveras
 */
package clasepersonal;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    
    private String posicion;
    private String departamento;
    private String gerencia;
    private double salario;
    private int id_empleado;
    private String tipo_empleado; //Un empelado puede ser fijo, temporal o pasante
    
    
    /* Constructores */
    public Empleado (){}
    
    public Empleado(String posicion, String departamento, String gerencia, double salario, int id_empleado, String tipo_empleado, String nombre, String apellido, String sexo, String ocupacion, String telefono, String estadoCivil, String telefono_celular, String email) {
        super(nombre, apellido, sexo, ocupacion, telefono, estadoCivil, telefono_celular, email);
        this.posicion = posicion;
        this.departamento = departamento;
        this.gerencia = gerencia;
        this.salario = salario;
        this.id_empleado = id_empleado;
        this.tipo_empleado = tipo_empleado;
    }

    
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }
    
    
}
