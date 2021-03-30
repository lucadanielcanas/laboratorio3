package com.pelado.lukson.ejercicio2;

import java.util.UUID;

public class Client {

    private UUID id;
    private String name;
    private String email;
    private double discountPercent;

    public Client() {
        this.id = encryptedId();
    }

    public Client(String name, String email, double discountPercent) {
        this.id = encryptedId();
        this.name = (name != null) ? name : "Anonimo";
        this.email = email;
        this.discountPercent = discountPercent;
    }

    public UUID getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) {  this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public double getDiscountPercent() { return discountPercent; }

    public void setDiscountPercent(double discountPercent) { this.discountPercent = discountPercent; }

    private static UUID encryptedId() { return UUID.randomUUID(); }

    @Override
    public String toString() {
        String msg = "Cliente[id= " + getId() +
                     ", nombre= " + getName() +
                     ", email= " + getEmail() +
                     ", descuento= " + getDiscountPercent() + "]";

        return msg;
    }

}
