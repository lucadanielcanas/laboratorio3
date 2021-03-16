package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args)
    {
        int N = 10;
        while(N < 77)
        {
            int i = 1;
            N = N + 1;
            i++;
        }

        System.out.println("Valor de N: " + N + "\n");

        while(N != 3 && N > 3)
        {
            int i = 1;
            N = N - 1;
            i++;
        }

        System.out.println("Valor de N: " + N + "\n");

        N = N * 2;

        System.out.println("Valor de N: " + N + "\n");
    }
}
