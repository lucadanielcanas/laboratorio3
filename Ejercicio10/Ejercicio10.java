package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        FahrenheitConvert convert = new FahrenheitConvert();

        float fahrenheit = sc.nextFloat();

        float celcius = convert.fahrenheitToCelsius(fahrenheit);

        System.out.println("Los grados centrigrados son: " + celcius);
    }
}
