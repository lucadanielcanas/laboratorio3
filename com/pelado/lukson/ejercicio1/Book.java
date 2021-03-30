package com.pelado.lukson.ejercicio1;

public class Book {

    private String title;
    private double price;
    private int stock;
    private Author author = new Author();

    public Book() {
    }

    public Book(String title, double price, int stock, Author author) {
        this.title = (title != null) ? title : "Sin titulo";
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void printBook() {
        System.out.println("Nombre del libro: " + getTitle() + "\n");
        this.author.printAuthor();
        System.out.println("Precio del libro: " + getPrice() + "\n");
        System.out.println("Stock disponible: " + getStock() + "\n");
    }

    public void addStock(int newStock) {
        setStock(this.stock + newStock);
    }

    @Override
    public String toString() {
        String msg = "El libro: " + getTitle() + " de: " + author.getFirstname() + ", " + author.getLastname() +
                     ". Se vende a: " + getPrice() + " pesos.";

        return msg;
    }
}
