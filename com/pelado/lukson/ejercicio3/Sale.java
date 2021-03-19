package com.pelado.lukson.ejercicio3;

public class Sale {

    private int id;
    private String description;
    private int quantity;
    private double unityPrice;

    public Sale()
    { }

    public Sale(int id, String description, int quantity, double unityPrice)
    {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unityPrice = unityPrice;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnityPrice() {
        return this.unityPrice;
    }

    public void setUnityPrice(double unityPrice) {
        this.unityPrice = unityPrice;
    }

    private double totalPrice()
    {
        return this.unityPrice * this.quantity;
    }

    public void printData()
    {
        System.out.printf("" +
                "ItemVenta[id=%d, descripcion=%s, cantidad=%d, pUnitario=%.4f, pTotal=%f]"
                , getId(), getDescription(), getQuantity(), getUnityPrice(), totalPrice());
    }
}
