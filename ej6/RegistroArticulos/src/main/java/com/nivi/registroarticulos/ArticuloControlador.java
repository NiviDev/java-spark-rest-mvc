/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registroarticulos;

import spark.Route;
import spark.Request;
import spark.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author nicov
 */
class ArticuloControlador {

    public static Route getArticulo = (Request req, Response res) -> {
        ArticuloDAO aDAO = new ArticuloDAO();
        Articulo art = aDAO.getArticulo(req.queryParams("codigo"));
        ObjectMapper mapperObject = new ObjectMapper();
        String jsonStr = mapperObject.writeValueAsString(art);
        return jsonStr;
    };
}
