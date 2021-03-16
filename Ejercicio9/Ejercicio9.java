package Ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Funciones funcion = new Funciones();
        Funciones1 funcion1 = new Funciones1();

        funcion.ElDobleOTriple(number);
        funcion1.ElDobleOTriple(number);
    }
}
