package Ejercicio12;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double kmh = sc.nextDouble();

        ConversorDeKmhToMs conversor = new ConversorDeKmhToMs();
        double ms = conversor.Conversor(kmh);

        System.out.println("El equivalente de " + kmh + "km/h en m/s es: " + ms);
    }
}
