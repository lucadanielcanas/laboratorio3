package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args)
    {
        int B = -10;

        Negativo_o_Positivo(B);
    }

    private static void Negativo_o_Positivo(int number)
    {
        if(number < 0)
            System.out.println("El numero es negativo. \n");
        else
            System.out.println("El numero es positivo. \n");
    }
}
