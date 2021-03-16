package Ejercicio4;

import java.util.LinkedList;

public class Ejercicio4 {
    public static void main(String[] args)
    {
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        int saveValue = B;

        B = C;
        C = A;
        A = D;
        D = saveValue;

        System.out.println("Valor de A: " + A + ", valor de B: " + B + ", valor de C: " + C + " y valor de D: " + D);
    }
}
