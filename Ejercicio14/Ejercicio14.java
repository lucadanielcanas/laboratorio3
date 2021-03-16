package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();

        Esfera esfera = new Esfera();

        double volumen = esfera.volumenEsfera(radio);

        System.out.println("El volumen de la esfera con radio " + radio + "es: " + volumen);

    }
}
