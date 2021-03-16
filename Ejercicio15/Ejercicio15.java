package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        Triangulo triangulo = new Triangulo();

        double area = triangulo.calcularArea(base, altura);

        System.out.println("El area del triangulo es: " + area + "cm2");
    }
}
