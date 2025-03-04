/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.palindromo;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author nicov
 */
class PalindromoControlador {

    public static Route palindromo = (Request request, Response response) -> {
        Palindromo p = new Palindromo();
        String cadena = request.queryParams("pal");
        Boolean consulta = p.check(cadena);
        return "¿Es palindromo?: " + consulta;
    };

}
