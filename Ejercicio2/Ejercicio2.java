package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args)
    {
        Operaciones operaciones = new Operaciones();

        int X = 10;
        int Y = 20;
        double N = 30.50;
        double M = 40.50;

        double suma = operaciones.sumaDeValores(X, N);
        double resta = operaciones.restaDeValores(Y, M);
        double multiplicacion = operaciones.multiplicacionDeValores(Y, N);
        double division = operaciones.divisionDeValores(X, M);


        System.out.println("Suma de valores: " + suma + "\n");
        System.out.println("Resta de valores: " + resta + "\n");
        System.out.println("Multiplicacion de valores: " + multiplicacion + "\n");
        System.out.println("Division de valores: " + division + "\n");
    }
}
