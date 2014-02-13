package edu.utpl.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/fs")
public class SearchController {

    @ModelAttribute("source")
    public String source() {
        return "fs";
    }

    @RequestMapping(value = "/searh", method = RequestMethod.GET)
    public String composer(ModelMap model) {
        return "searh";
    }
}
