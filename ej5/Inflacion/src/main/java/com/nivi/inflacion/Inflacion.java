/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.inflacion;

/**
 *
 * @author nicov
 */
class Inflacion {

    private final double porcentajeInflacion = 150;

    double getInflacion(double montoD, double mesesD) {
        double años = mesesD / 12;
        double valorInf = montoD / Math.pow(1 + (porcentajeInflacion / 100), años);
        return valorInf;
    }

}
