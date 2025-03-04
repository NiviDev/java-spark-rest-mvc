/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.registrofamiliar;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class RegistroFamiliar {

    public static void main(String[] args) {
        get("/getPersonas", PersonaControlador.getPersonas);
        get("/getNietos", PersonaControlador.getNietos);
        get("/getHijos", PersonaControlador.getHijos);
    }
}
