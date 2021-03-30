package com.pelado.lukson.ejercicio1;

public class Author {

    private String firstname;
    private String lastname;
    private String email;
    private char gender;

    public Author() {

    }

    public Author(String firstname, String lastname, String email, char gender) {
        this.firstname = (firstname != null) ? firstname : "Anonimo";
        this.lastname = lastname;
        this.email = email;
        this.gender = (gender == 'M' || gender == 'F') ? gender : null;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printAuthor() {
        System.out.println("Datos del autor: \n");
        System.out.println("Nombre completo: " + getFirstname() + ", " + getLastname() + "\n");
        System.out.println("Email: " + getEmail() + "\n");
        System.out.println("Genero: " + getGender() + "\n");
    }
}
