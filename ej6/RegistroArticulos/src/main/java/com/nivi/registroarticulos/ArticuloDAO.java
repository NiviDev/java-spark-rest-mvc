/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registroarticulos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
class ArticuloDAO {

    private List<Articulo> articulos;

    private void init() {
        articulos = new ArrayList<>();
        Articulo cafe = new Articulo("016837", "Café instantáneo suave", 2399.99f);
        Articulo queso = new Articulo("879656", "Queso crema tradicional", 1630.60f);
        Articulo aceite = new Articulo("012050", "Aceite de girasol", 1400f);

        articulos.add(cafe);
        articulos.add(queso);
        articulos.add(aceite);
    }

    ;
    Articulo getArticulo(String codigo) {
        init();
        Articulo buscado = articulos.stream()
                .filter(art -> codigo.equals(art.getCodigo()))
                .findAny()
                .orElse(null);
        if (buscado != null) {
            return buscado;
        }
        return null;
    }

}
