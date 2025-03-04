/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.emergencias;

import spark.Route;
import spark.Request;
import spark.Response;

/**
 *
 * @author nicov
 */
class EmergenciasControlador {

    public static Route getNumber = (Request req, Response res) -> {
        EmergenciaDAO eDAO = new EmergenciaDAO();
        String number = eDAO.getNumber(req.queryParams("number"));
        return number;
    };
}
