
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5GregorianCalendarDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calendar agora = new GregorianCalendar();
        Calendar calendario = new GregorianCalendar();
        //Date trialTime = new Date();
        //calendario.setTime(trialTime);
        System.out.println("Ano: "+calendario.get(Calendar.YEAR));
        System.out.println("Era: "+calendario.get(Calendar.ERA));
        System.out.println("Mes: "+calendario.get(Calendar.MONTH));
        System.out.println("Semana do Ano: "+calendario.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Semana do Mes: "+calendario.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia do Ano: "+calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println("Data: "+calendario.get(Calendar.DATE));
        System.out.println("Hora: "+calendario.get(Calendar.HOUR));
        System.out.println("Hora do dia: "+calendario.get(Calendar.HOUR_OF_DAY));
        System.out.println("Hora completa: "+calendario.get(Calendar.HOUR_OF_DAY)
                +":"+calendario.get(Calendar.MINUTE)+"h");

        
    }
    
}
