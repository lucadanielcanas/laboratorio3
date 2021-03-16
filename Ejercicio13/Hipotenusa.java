package Ejercicio13;

public class Hipotenusa {
    public double calcularHipotenusa(double a, double b)
    {
        double hipAlCuadrado = (double)((Math.pow(a, 2) + Math.pow(b, 2)));
        double hipotenusa = (double)Math.sqrt(hipAlCuadrado);
        return hipotenusa;
    }
}
