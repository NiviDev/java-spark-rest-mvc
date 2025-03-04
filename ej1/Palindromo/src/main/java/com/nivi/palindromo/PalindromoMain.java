/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.palindromo;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class PalindromoMain {

    public static void main(String[] args) {
        /* Ruta , Controlador */
        get("/palindromo", PalindromoControlador.palindromo);
    }
}
