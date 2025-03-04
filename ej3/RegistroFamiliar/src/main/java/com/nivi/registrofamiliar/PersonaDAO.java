/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registrofamiliar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
public class PersonaDAO {

    private List<Persona> personas;

    private void init() {
        personas = new ArrayList<Persona>();
        Persona pMaria = new Persona("Maria", "Viluron");
        Persona pDorila = new Persona("Dorila", "Leiva");
        Persona pOrlando = new Persona("Orlando", "Salinas");
        Persona pRosana = new Persona("Rosana", "Salinas");
        Persona pAriel = new Persona("Ariel", "Vilurón");
        Persona pNico = new Persona("Nicolás", "Vilurón");
        pMaria.addHijo(pAriel);
        pDorila.addHijo(pRosana);
        pOrlando.addHijo(pRosana);
        pAriel.addHijo(pNico);
        pRosana.addHijo(pNico);
        personas.add(pNico);
        personas.add(pMaria);
        personas.add(pDorila);
        personas.add(pOrlando);
        personas.add(pRosana);
        personas.add(pAriel);
    }

    ;
    
    public List<Persona> getNietos(String nombre) {
        init();
        List<Persona> nietos;
        nietos = new ArrayList<Persona>();
        Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
        if (pEncontrada != null) {
            pEncontrada.getHijos().forEach(persona -> {
                nietos.addAll(persona.getHijos());
            });
        }
        return nietos;
    }

    public List<Persona> getPersonas() {
        init();
        return personas;
    }

    public List<Persona> getHijos(String nombre) {
        init();
        List<Persona> hijos = null;
        Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
        if (pEncontrada != null) {
            hijos = pEncontrada.getHijos();
        }
        return hijos;
    }

}
