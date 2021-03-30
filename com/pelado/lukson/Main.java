package com.pelado.lukson;

import com.pelado.lukson.ejercicio1.Author;
import com.pelado.lukson.ejercicio1.Book;
import com.pelado.lukson.ejercicio2.Bill;
import com.pelado.lukson.ejercicio2.Client;

public class Main {
    public static void main(String[] args) {
        //exercise1();
        exercise2();
    }

    private static void exercise1() {
        Author joshua = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        joshua.printAuthor();

        System.out.println("-----------------------------------------------------------------------\n");

        Book book = new Book("Effective Java", 450, 150, joshua);
        book.printBook();

        System.out.println("-----------------------------------------------------------------------\n");

        book.setPrice(500);
        book.addStock(50);
        book.printBook();

        System.out.println("-----------------------------------------------------------------------\n");

        String consultPrice = book.toString();
        System.out.println(consultPrice);
    }
    private static void exercise2() {
        Client client = new Client();
        client.setName("Luca Daniel Cañas");
        client.setEmail("lucacaniasjob@gmail.com");
        client.setDiscountPercent(25);

        String clientData = client.toString();
        System.out.println(clientData);

        System.out.println("------------------------------------------------------\n");

        Bill bill = new Bill(1000, client);
        String billData = bill.toString();

        System.out.println(billData);

    }
}
