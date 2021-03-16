package Ejercicio17;

import java.util.*;

public class Ejercicio17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean cifras = cantidadDeCifras(numero);

        if(cifras)
        {
            String numeroString = String.valueOf(numero);
            char[] valores = numeroString.toCharArray();

            for(int i = 0; i < 5; i++)
            {
                System.out.println(valores[i]);
                i = i + 1;
            }
        }
        else
            System.out.println("El numero ingresado no es valido.");
    }

    public static boolean cantidadDeCifras(int numero)
    {
        int contador = 0;

        while(numero != 0)
        {
            numero = numero / 10;
            contador++;
        }

        if(contador == 5)
            return true;
        else
            return false;
    }
}
