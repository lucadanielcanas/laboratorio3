package Ejercicio11;

import java.util.Scanner;

public class Circunsferencia {
    public float longitud(float radio)
    {
        float longitud = (float)(radio * 2 * Math.PI);
        return longitud;
    }

    public float area(float radio)
    {
        float area = (float)(radio * radio * Math.PI);

        return area;
    }
}
