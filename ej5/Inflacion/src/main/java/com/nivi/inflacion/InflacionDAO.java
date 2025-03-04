/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.inflacion;

/**
 *
 * @author nicov
 */
class InflacionDAO {

    private final Inflacion calculadora = new Inflacion();

    public double getInflacion(String monto, String meses) {
        double montoD = Double.parseDouble(monto);
        double mesesD = Double.parseDouble(meses);
        double result = calculadora.getInflacion(montoD, mesesD);
        return result;
    }

}
