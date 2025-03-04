/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registrofamiliar;

import java.util.List;
import spark.Request;
import spark.Response;
import spark.Route;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author nicov
 */
public class PersonaControlador {

    public static Route getNietos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getNietos(req.queryParams("nombre"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };
    public static Route getPersonas = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getPersonas();
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };
    public static Route getHijos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getHijos(req.queryParams("nombre"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };
}
