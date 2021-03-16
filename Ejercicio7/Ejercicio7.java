package Ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args)
    {
        int C = 27;

        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        operaciones.Positivo_o_Negativo(C);
        operaciones.Par_o_Impar(C);
        operaciones.multiploDe5o10(C, 5);
        operaciones.multiploDe5o10(C,10);
        operaciones.menorMayorA100(C);
    }
}
