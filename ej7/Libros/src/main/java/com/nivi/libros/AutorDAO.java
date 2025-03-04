/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.libros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
class AutorDAO {

    private List<Autor> autores;

    private void init() {
        autores = new ArrayList<>();
        Autor king = new Autor("Stephen King");
        Autor gwynne = new Autor("John Gwynne");
        Autor martin = new Autor("George RR Martin");
        Libro it = new Libro("9783453435773", "It", "Terror", "Varios niños de una pequeña ciudad del estado de Maine se alían para combatir a una entidad diabólica que adopta la forma de un payaso,");
        Libro sombDioses = new Libro("9780316539883", "La sombra de los dioses", "Fantasia", "Ha pasado un siglo desde que los dioses lucharon y se extinguieron. Ahora solo quedan sus huesos, que prometen un gran poder a aquellos lo suficientemente valientes como para buscarlos");
        Libro got = new Libro("9783527507986", "Juego de Tronos", "Fantasia/Ficción Politica", "La trama se sitúa en un mundo ficticio con elementos fantásticos, como dragones y poderes, pero también otros muy reales como son las luchas de poder, los enfrentamientos políticos, las traiciones y la continua guerra por el trono que gobierna los siete reinos de Poniente");
        king.addLibro(it);
        gwynne.addLibro(sombDioses);
        martin.addLibro(got);
        autores.add(king);
        autores.add(gwynne);
        autores.add(martin);
    }

    public Autor getAutor(String nombre) {
        init();
        Autor autor = autores.stream()
                .filter(a -> nombre.equals(a.getNombre()))
                .findAny()
                .orElse(null);
        if (autor != null) {
            return autor;
        }
        return null;
    }

}
