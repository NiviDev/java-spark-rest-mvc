/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.libros;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
class Autor {

    private String nombre;
    private List<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

}
