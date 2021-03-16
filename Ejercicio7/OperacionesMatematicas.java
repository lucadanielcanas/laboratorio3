package Ejercicio7;

public class OperacionesMatematicas {
    public void Positivo_o_Negativo(int number)
    {
        if(number < 0)
            System.out.println("El numero es negativo. \n");
        else
            System.out.println("El numero es positivo. \n");
    }

    public void Par_o_Impar(int number)
    {
        if(number % 2 == 0)
            System.out.println("El numero es par. \n");
        else
            System.out.println("El numero es impar. \n");
    }

    public void multiploDe5o10(int number, int multiplo)
    {
        int resto;

        if(multiplo == 5)
        {
            resto = number % multiplo;
            if(resto == 0)
                System.out.println("El numero es multiplo de 5. \n");
            else
                System.out.println("El numero no es multiplo de 5. \n");
        }
        else if(multiplo == 10)
        {
            resto = number % multiplo;
            if(resto == 0)
                System.out.println("El número es multiplo de 10. \n");
            else
                System.out.println("El número no es multiplo de 10. \n");
        }
        else
        {
            System.out.println("Solo puede ingresar como multiplo los numeros 5 o 10. \n");
        }
    }

    public void menorMayorA100(int number)
    {
        if(number > 100)
            System.out.println("El numero es mayor a 100. \n");
        else
            System.out.println("El numero es menor a 100. \n");
    }
}
