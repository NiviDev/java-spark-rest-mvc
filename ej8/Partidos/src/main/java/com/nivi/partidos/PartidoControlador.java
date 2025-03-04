/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.partidos;

import spark.Route;
import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Request;
import spark.Response;

/**
 *
 * @author nicov
 */
public class PartidoControlador {

    public static Route getPartidos = (Request req, Response res) -> {
        PartidoDAO pDAO = new PartidoDAO();
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(pDAO.getPartidos());
        return jsonString;
    };
    public static Route getJugadosPor = (Request req, Response res) -> {
        PartidoDAO pDAO = new PartidoDAO();
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(pDAO.getJugadosPor(req.queryParams("equipo")));
        return jsonString;
    };

    public static Route getJugadosLocal = (Request req, Response res) -> {
        PartidoDAO pDAO = new PartidoDAO();
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(pDAO.getJugadosLocal(req.queryParams("equipo")));
        return jsonString;
    };
    public static Route getAJugarVisitante = (Request req, Response res) -> {
        PartidoDAO pDAO = new PartidoDAO();
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(pDAO.getAJugarVisitante(req.queryParams("equipo")));
        return jsonString;
    };
    public static Route getCantidadGanados = (Request req, Response res) -> {
        PartidoDAO pDAO = new PartidoDAO();
        int cantidad;
        cantidad = pDAO.getCantidadGanados(req.queryParams("equipo"));
        return cantidad;
    };

    public static Route getCantidadGoles = (Request req, Response res) -> {
        PartidoDAO pDAO = new PartidoDAO();
        int cantidad;
        cantidad = pDAO.getCantidadGoles(req.queryParams("equipo"));
        return cantidad;
    };

}
