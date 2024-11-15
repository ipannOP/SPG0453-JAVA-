/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainconverter;

/**
 *
 * @author Irfan Hakimie
 */
//formula semua sini
public class Formula {
    // Celsius pegi Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Meters pegi Kilometers
    public double meterToKilometer(double meters) {
        return meters / 1000;
    }

    // Megabytes pegi Gigabytes
    public double megabytesToGigabytes(double megabytes) {
        return megabytes / 1024;
    }

    // Kilograms pegi Pounds
    public double kilogramToPound(double kilograms) {
        return kilograms * 2.20462;
    }
}

