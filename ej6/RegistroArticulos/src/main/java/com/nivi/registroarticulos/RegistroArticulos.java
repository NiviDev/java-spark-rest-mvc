/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.registroarticulos;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class RegistroArticulos {

    public static void main(String[] args) {
        get("/getArticulo", ArticuloControlador.getArticulo);
    }
}
