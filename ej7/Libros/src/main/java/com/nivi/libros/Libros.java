/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.libros;
import static spark.Spark.*;
/**
 *
 * @author nicov
 */
public class Libros {

    public static void main(String[] args) {
        get("/getLibros", AutorControlador.getLibros);
    }
}
