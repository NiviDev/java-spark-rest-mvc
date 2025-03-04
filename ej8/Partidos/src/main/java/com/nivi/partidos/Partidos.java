/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.partidos;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class Partidos {

    public static void main(String[] args) {
        get("/getPartidos", PartidoControlador.getPartidos);
        get("/getJugadosPor", PartidoControlador.getJugadosPor);
        get("/getJugadosLocal", PartidoControlador.getJugadosLocal);
        get("/getAJugarVisitante", PartidoControlador.getAJugarVisitante);
        get("/getCantidadGanados", PartidoControlador.getCantidadGanados);
        get("/getCantidadGoles", PartidoControlador.getCantidadGoles);
    }
}
