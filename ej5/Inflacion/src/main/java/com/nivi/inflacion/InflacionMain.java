/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.inflacion;

import static spark.Spark.*;
/**
 *
 * @author nicov
 */
public class InflacionMain {

    public static void main(String[] args) {
        get("/getInflacion", InflacionControlador.getInflacion);
    }
}
