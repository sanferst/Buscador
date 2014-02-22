package edu.utpl.search.controller;

import edu.utpl.search.domain.ResultadoOCW;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Source;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

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

    @RequestMapping(value = "/consultar")
    public String edit(String q, ModelMap model) {
        RestTemplate template = new RestTemplate();
        // Message Converters
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(new SourceHttpMessageConverter<Source>());
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(new MappingJacksonHttpMessageConverter());
        template.setMessageConverters(messageConverters);

        
        ResultadoOCW response = template.getForObject("http://carbono.utpl.edu.ec:8080/WSSearcher/webresources/serendipityrest?q=" + q, ResultadoOCW.class);

        System.out.println("consultar: " + q);
        model.addAttribute("resultados", response);
        model.addAttribute("items", response.getItemsOcw());
        return "resultado";
    }
}
