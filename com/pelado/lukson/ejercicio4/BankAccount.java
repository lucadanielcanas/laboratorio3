package com.pelado.lukson.ejercicio4;

public class BankAccount {

    private int id;
    private String name;
    private double balance;

    public BankAccount()
    { }
    public BankAccount(int id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit(double deposit)
    {
        this.balance = this.balance + deposit;
        return this.balance;
    }

    public double debit(double debit)
    {
        if(this.balance < debit)
        {
            System.out.println("El importe ingresado supera el saldo en la cuenta.");
            return this.balance;
        }
        else
        {
            this.balance = this.balance - debit;
            return this.balance - debit;
        }
    }

    public void BankAccountData()
    {
        System.out.println("El numero de cuenta: " +
                                this.id + " del titular: " +
                                this.name + " tiene: " +
                                this.balance +
                                " de saldo disponible. \n");
    }
}
