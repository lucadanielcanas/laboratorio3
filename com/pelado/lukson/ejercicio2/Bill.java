package com.pelado.lukson.ejercicio2;

import java.time.LocalDate;
import java.util.UUID;

public class Bill {

    private UUID id = encryptedId();
    private double total;
    private LocalDate date;
    private Client client = new Client();

    public Bill(double total, Client client) {
        this.date = LocalDate.now();
        this.total = total;
        this.client = client;
    }

    public UUID getId() { return id; }

    public double getTotal() { return total - discount(); }

    public LocalDate getDate() { return date; }

    private static UUID encryptedId() { return UUID.randomUUID(); }

    private double discount() {
        return (this.total * this.client.getDiscountPercent()) / 100;
    }

    @Override
    public String toString() {
        String msg = " Factura[id= "+ getId() +
                     ", fecha=" + getDate() +
                     ", monto= "+ getTotal() +
                     ", montoDesc="+ discount() +
                     ", Cliente[id= " + this.client.getId() + ", nombre= "+ this.client.getName() + ",\n" +
                     "email= "+ this.client.getEmail() +", descuento= "+ this.client.getDiscountPercent()+ "]]";
        return msg;
    }
}
