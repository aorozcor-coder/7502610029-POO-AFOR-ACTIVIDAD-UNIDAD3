package Taller18_ISP.Ejercicio_03;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Conducible auto = new Auto();
        Camion camion = new Camion();

        System.out.println("--- Demostración ISP en Vehículos ---");

        System.out.println("\n--- Prueba de Auto ---");
        auto.conducir();

        System.out.println("\n--- Prueba de Camión ---");
        camion.conducir();
        camion.cargarMercancia(1500.75);
    }
}
