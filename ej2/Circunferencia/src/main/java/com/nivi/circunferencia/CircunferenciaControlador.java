/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.circunferencia;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author nicov
 */
class CircunferenciaControlador {

    public static Route perimetro = (Request request, Response response) -> {
        Circunferencia c = new Circunferencia();
        float radio = Float.parseFloat(request.queryParams("rad"));
        float resPerim = c.getPerimetro(radio);
        return "El perimetro es: " + resPerim;
    };
    public static Route area = (Request request, Response response) -> {
        Circunferencia c = new Circunferencia();
        float radio = Float.parseFloat(request.queryParams("rad"));
        float resArea = c.getArea(radio);
        return "El area es: " + resArea;
    };
}
