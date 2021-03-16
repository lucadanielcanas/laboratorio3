package Ejercicio16;

import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        boolean cifras = cantidadDeCifras(numero);
        LinkedList<Integer> lista = new LinkedList<Integer>();
        if(cifras)
        {
            while(numero > 0)
            {
                lista.push(numero % 10);
                numero = numero / 10;
            }
            while((!lista.isEmpty()))
            {
                System.out.println(lista.pop());
            }
        }
        else
        {
            System.out.println("Solo se permiten numeros de 3 cifras. \n");
        }
    }

    public static boolean cantidadDeCifras(int numero)
    {
        int contador = 0;

        while(numero != 0)
        {
            numero = numero / 10;
            contador++;
        }

        if(contador == 3)
            return true;
        else
            return false;
    }
}
