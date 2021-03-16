package Ejercicio18;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Hora {

    public String comprobarFecha(int h, int m, int s)
    {
        String hora = null;
        if((h < 25 && h > -1) && (m < 61 && m > -1) && (s < 61 && s > -1))
        {
            String horaUsuario = (String)(String.valueOf(h) + ':' + String.valueOf(m) + ':' + String.valueOf(s));
            hora = parsearHora(horaUsuario);
        }
        return hora;
    }

    public String parsearHora(String hora)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

        Date date = null;

        try
        {
            date = sdf.parse(hora);
        }catch(ParseException ex)
        {
            ex.printStackTrace();
        }

        String horaFormateada = sdf.format(date);

        return horaFormateada;
    }
}
