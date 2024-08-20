package com.mycompany.trabajopracticodegit;

import java.util.Random;

public class RelojFit extends Reloj {

    private int pasos;

    public RelojFit(int dia, int hora, String modelo, String numSerie) {
        super(dia, hora, modelo, numSerie);
        this.pasos = 0;
    }

    public void cuentaPasos(int x1, int y1, int x2, int y2) {
        int distancia = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        pasos += distancia;
        System.out.println("Pasos calculados: " + distancia);
    }

    public void frecuenciaAleatoria() {
        Random rand = new Random();
        int frecuencia = rand.nextInt(100); // Frecuencia aleatoria entre 0 y 99
        System.out.println("Frecuencia aleatoria: " + frecuencia);
    }
}
