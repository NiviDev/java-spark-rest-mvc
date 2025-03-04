/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.inflacion;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author nicov
 */
class InflacionControlador {

    public static Route getInflacion = (Request req, Response res) -> {
        InflacionDAO iDAO = new InflacionDAO();
        double estimacion = iDAO.getInflacion(req.queryParams("monto"), req.queryParams("meses"));
        return estimacion;
    };
}
