/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.libros;

import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Route;
import spark.Request;
import spark.Response;

/**
 *
 * @author nicov
 */
class AutorControlador {

    public static Route getLibros = (Request req, Response res) -> {
        AutorDAO aDAO = new AutorDAO();
        Autor autor = aDAO.getAutor(req.queryParams("autor"));
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(autor.getLibros());
        return jsonString;
    };
}
