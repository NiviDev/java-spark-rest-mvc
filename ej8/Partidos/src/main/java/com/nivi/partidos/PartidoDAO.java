/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.partidos;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
class PartidoDAO {

    private List<Partido> partidos;

    private void init() {
        partidos = new ArrayList<>();
        Partido p1 = new Partido("River", "Boca", "2", "2", true);
        Partido p2 = new Partido("River", "Racing", "0", "0", true);
        Partido p3 = new Partido("Aldocivi", "Racing", "", "", false);
        Partido p4 = new Partido("Talleres", "Racing", "", "", false);
        partidos.add(p1);
        partidos.add(p2);
        partidos.add(p3);
        partidos.add(p4);
    }

    public PartidoDAO() {
        init();
    }

    public ArrayList<Partido> getJugadosPor(String equipo) {
        ArrayList<Partido> jugadosPor = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.isJugado() && (equipo.equals(partido.getLocal()) || equipo.equals(partido.getVisitante()))) {
                jugadosPor.add(partido);
            }
        }
        return jugadosPor;
    }

    public ArrayList<Partido> getJugadosLocal(String equipo) {
        ArrayList<Partido> jugadosLocal = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.isJugado() && equipo.equals(partido.getLocal())) {
                jugadosLocal.add(partido);
            }
        }
        return jugadosLocal;
    }

    public Object getAJugarVisitante(String equipo) {
        List<Partido> aJugar = new ArrayList<>();
        for (Partido partido : partidos) {
            if (!partido.isJugado() && equipo.equals(partido.getVisitante())) {
                aJugar.add(partido);
            }
        }
        return aJugar;
    }

    public int getCantidadGanados(String equipo) {
        int cant = 0;
        ArrayList<Partido> jugados = getJugadosPor(equipo);
        for (Partido partido : jugados) {
            if (equipo.equals(partido.getLocal()) && Integer.parseInt(partido.getGoleslocal()) > Integer.parseInt(partido.getGolesvisitante())) {
                cant++;
            } else if (equipo.equals(partido.getVisitante()) && Integer.parseInt(partido.getGoleslocal()) < Integer.parseInt(partido.getGolesvisitante())) {
                cant++;
            }
        }
        return cant;
    }

    public int getCantidadGoles(String equipo) {
        int cant = 0;
        ArrayList<Partido> jugados = getJugadosPor(equipo);
        for (Partido partido : jugados) {
            if (equipo.equals(partido.getLocal())) {
                cant += Integer.parseInt(partido.getGoleslocal());
            } else if (equipo.equals(partido.getVisitante())) {
                cant += Integer.parseInt(partido.getGolesvisitante());
            }
        }
        return cant;
    }
}
