package com.mycompany.trabajopracticodegit;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private double altura;

    public Persona(String nombre, String apellidos, int edad, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void hablar() {
        System.out.println(nombre + " esta hablando.");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void decirHora(Reloj reloj) {
        System.out.println("La hora es: " + reloj.getHora() + " en el dia " + reloj.getDia());
    }
}
