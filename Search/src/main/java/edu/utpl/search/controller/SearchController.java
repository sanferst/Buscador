package edu.utpl.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/busqueda")
public class SearchController {

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping
    public String buscador(ModelMap model) {
        System.out.println("buscador... accediendo");
        return "search";
    }
}
