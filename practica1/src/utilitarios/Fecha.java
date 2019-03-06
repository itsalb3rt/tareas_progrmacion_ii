/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author Usuario
 */
public class Fecha {

    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Fecha() {
        dia = 0;
        mes = 0;
        ano = 0;
    }

    public int getDia() {return dia;}

    public int getMes() {return mes;}

    public int GetAno() {return ano;}

    public void setDia(int dia) {
        switch (mes) {
            case 2:
                if (esBiniesto(ano)) {
                    this.dia = (dia > 0 && dia <= 29) ? dia : 0;
                } else {
                    this.dia = (dia > 0 && dia <= 28) ? dia : 0;
                }   break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.dia = (dia > 0 && dia <= 31) ? dia : 0;
                break;
            default:
                this.dia = (dia > 0 && dia <= 30) ? dia : 0;
                break;
        }
    }

    public void setMes(int mes) {
        this.mes = (mes > 0 && mes <= 12) ? mes : 0;
    }

    public void setAno(int ano) {
        this.ano = (ano >= 0) ? ano : 0;
    }

    /* Calcular el ano bisiesto */
    public boolean esBiniesto(int ano) {
        return bisiesto(ano);
    }

    public boolean esBisiesto() {
        return bisiesto(this.ano);
    }

    private boolean bisiesto(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        }

        return false;

    }

}
