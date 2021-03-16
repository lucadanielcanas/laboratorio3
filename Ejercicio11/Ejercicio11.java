package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float radio = sc.nextFloat();

        Circunsferencia circunsferencia = new Circunsferencia();
        float longitud = circunsferencia.longitud(radio);
        float area = circunsferencia.area(radio);

        System.out.println("La longitud de la circunsferencia es: " + longitud + "\n");
        System.out.println("El area es: " + area);
    }
}
