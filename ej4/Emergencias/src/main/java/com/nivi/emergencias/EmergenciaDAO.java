/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.emergencias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
class EmergenciaDAO {

    private List<Emergencia> emergencias;

    private void init() {
        emergencias = new ArrayList<Emergencia>();
        Emergencia policia = new Emergencia("Policia", "911");
        Emergencia vGenero = new Emergencia("Violencia de Genero", "144");
        Emergencia bomberos = new Emergencia("Bomberos", "+54 266 442-7890");

        emergencias.add(policia);
        emergencias.add(vGenero);
        emergencias.add(bomberos);
    }

    public String getNumber(String emergencia) {
        init();
        Emergencia emerEncontrada = emergencias.stream()
                .filter(e -> emergencia.equals(e.getNombre()))
                .findAny()
                .orElse(null);
        if (emerEncontrada != null) {
            return emerEncontrada.getNumero();
        }
        return null;
    }
}
