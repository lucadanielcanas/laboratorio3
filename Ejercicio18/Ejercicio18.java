package Ejercicio18;

import java.util.*;

public class Ejercicio18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Hora hora = new Hora();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        String result = hora.comprobarFecha(h, m, s);

        if(result != null)
            System.out.println("La hora es válida. La hora es: " + result);
        else
            System.out.println("Los números ingresados no corresponden a una hora válida.");
    }
}
