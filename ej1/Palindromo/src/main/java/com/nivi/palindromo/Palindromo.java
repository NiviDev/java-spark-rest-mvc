/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.palindromo;

/**
 *
 * @author nicov
 */
public class Palindromo {

    Boolean check(String cadena) {
        int len = cadena.length();
        String cadenaAux = cadena.toLowerCase();
        for (int i = 0; i < len / 2; i++) {
            if (cadenaAux.charAt(i) != cadenaAux.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
;

}
