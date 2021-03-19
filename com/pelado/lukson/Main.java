package com.pelado.lukson;

import com.pelado.lukson.ejercicio1.Rectangle;
import com.pelado.lukson.ejercicio2.Employee;
import com.pelado.lukson.ejercicio3.Sale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //exercise1();
        //exercise2();
        exercise3();
    }

    private static void exercise1()
    {
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        Rectangle rectangle2 = new Rectangle();

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        double area2 = rectangle2.calculateArea();
        double perimeter2 = rectangle2.calculatePerimeter();

        System.out.println("El valor del ancho es: " + rectangle.getWidth() + "\n");
        System.out.println("El valor del alto es: " + rectangle.getHeight() + "\n");
        System.out.println("El valor del area es: " + area + "\n");
        System.out.println("El valor del perimetro es: " + perimeter + "\n");

        System.out.println("-----------------------------------------------------------------\n");

        rectangle.setWidth(9.0);
        rectangle.setHeight(8.0);
        area = rectangle.calculateArea();
        perimeter = rectangle.calculatePerimeter();

        System.out.println("El valor del area es: " + area + "\n");
        System.out.println("El valor del perimetro es: " + perimeter + "\n");

        System.out.println("-------------------------------------------------------------------\n");
        System.out.println("El valor del ancho es: " + rectangle2.getWidth() + "\n");
        System.out.println("El valor del alto es: " + rectangle2.getHeight() + "\n");
        System.out.println("El valor del area es: " + area2 + "\n");
        System.out.println("El valor del perimetro es: " + perimeter2 + "\n");

    }
    private static void exercise2()
    {
        Employee employee = new Employee("Carlos", "Gutierrez", 23456345,25000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese porcentaje para el salario de ser necesario: ");
        double percent = sc.nextInt();

        System.out.println("Salario anual sin porcentaje: " + employee.annualSalary() + "\n");

        if(percent != 0)
            System.out.println("Salario con porcentaje: " + employee.addMoney(percent));
    }
    private static void exercise3()
    {
        Sale sale = new Sale(1, "Motocicleta", 10, 450.000);
        sale.printData();
    }
    private static void exercise4()
    {

    }
    private static void exercise5()
    {

    }
}
