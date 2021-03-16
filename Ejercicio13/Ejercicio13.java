package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cateto1 = sc.nextDouble();
        double cateto2 = sc.nextDouble();

        Hipotenusa hipotenusa = new Hipotenusa();
        double resultado = hipotenusa.calcularHipotenusa(cateto1, cateto2);

        System.out.println("La longitud de la hipotenusa es: " + resultado);
    }
}
