package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args)
    {
        int A = 25;

        numeroParOImpar(A);
    }

    private static void numeroParOImpar(int number)
    {
        if(number % 2 == 0)
            System.out.println("El numero es par. \n");
        else
            System.out.println("El numero es impar. \n");
    }
}
