/**
 * Una funcion que diga el dia y mes en letra en el que nacio la persona 
 * clase fecha que reciba los datos
 */
package calendar_mes_dia_letras;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    public void datos_fecha(){
        
        Calendar calendario = Calendar.getInstance();
        calendario.set(getAno(),getMes(),getDia()); //Pasando fech
        String fecha = new SimpleDateFormat("'Usted nacio el 'EEEE dd 'de' MMMM 'del' YYYY").format(new Date((calendario.getWeekYear()-1900),(calendario.get(Calendar.MONTH)-1),calendario.get(Calendar.DAY_OF_MONTH)));
        System.out.println(fecha.toUpperCase());
        
    }
}
