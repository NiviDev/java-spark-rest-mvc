/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.partidos;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
class Partido {

    private String local;
    private String visitante;
    private String goleslocal;
    private String golesvisitante;
    private boolean jugado;

    Partido(String local, String visita, String goll, String golv, boolean jugado) {
        this.local = local;
        this.visitante = visita;
        this.goleslocal = goll;
        this.golesvisitante = golv;
        this.jugado = jugado;
    }
}
