package Ejercicio2;

public class Operaciones {

    public double sumaDeValores(int number1, double number2)
    {
        return number1 + number2;
    }

    public double multiplicacionDeValores(int number1, double number2)
    {
        return number1 * number2;
    }

    public double restaDeValores(int number1, double number2)
    {
        if(number1 > number2)
            return number1 - number2;
        else
            return number2 - number1;
    }

    public double divisionDeValores(int number1, double number2)
    {
        if(number1 > number2)
            return number1 / number2;
        else
            return number2 / number1;
    }
}
