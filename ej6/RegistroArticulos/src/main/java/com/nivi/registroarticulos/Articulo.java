/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registroarticulos;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
class Articulo {

    private String codigo;
    private String desc;
    private float neto;
    private float iva;
    private float total;

    public Articulo(String codigo, String desc, float neto) {
        this.codigo = codigo;
        this.desc = desc;
        this.neto = neto;
        this.iva = (neto * 0.21f);
        this.total = neto + iva;
    }
}
