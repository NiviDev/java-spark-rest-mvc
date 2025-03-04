/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.emergencias;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
class Emergencia {
    private String nombre;
    private String numero;
    
    public Emergencia(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }
}
