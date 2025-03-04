/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.libros;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
class Libro {

    private String isbn;
    private String nombre;
    private String genero;
    private String sinopsis;

    public Libro(String isbn, String nombre, String genero, String sinopsis) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }
}
