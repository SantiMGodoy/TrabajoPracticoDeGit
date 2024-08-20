/*
Implementar la clase Reloj (sin traducir frecuencia) 
Implementar la clase Persona, y asociarla a un Reloj
Crear la subclase RelojFit de Reloj, con metodos cuentaPasos(coordenadas x, y), y frecuenciaAleatoria.
Desde la java main class, llamar a los metodos de unReloj, accediendo desde objeto unaPersona
 */
package com.mycompany.trabajopracticodegit;

/**
 *
 * @author Santi
 */
public class Reloj {

    private int dia;
    private int hora;
    private String modelo;
    private String numSerie;

    public Reloj(int dia, int hora, String modelo, String numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public int getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void incrementarDia() {
        dia++;
    }

    public void incrementarHora() {
        hora++;
        if (hora >= 24) {
            hora = 0;
            incrementarDia();
        }
    }

    public void limpiarPantalla() {
        this.dia = 1; // Reiniciar al día 1
        this.hora = 0; // Reiniciar a la hora 0
    }
}
