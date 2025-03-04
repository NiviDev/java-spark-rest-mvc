/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.emergencias;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class EmergenciasMain {

    public static void main(String[] args) {
        get("/getNumber", EmergenciasControlador.getNumber);
    }
}
