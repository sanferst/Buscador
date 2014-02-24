package edu.utpl.search.controller;

import edu.utpl.search.domain.ItemOcw;
import edu.utpl.search.domain.ResultadoDetalleOCW;
import edu.utpl.search.domain.ResultadoOCW;
import edu.utpl.search.domain.ResultadoSimilar;
import edu.utpl.search.domain.UserLog;
import edu.utpl.search.repository.UserLogRepository;
import edu.utpl.search.service.UserLogService;
import edu.utpl.search.service.UserService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.xml.transform.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/busqueda")
public class SearchController {
    
    @Autowired
    private UserLogRepository repository;
    
    @Autowired 
    private UserLogService service;
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
        //Se guarda la busqueda del usuario actual
        String usuarioEnSession = SecurityContextHolder.getContext().getAuthentication().getName();
        UserLog userLog = new UserLog(usuarioEnSession, new Date(), q);
        service.create(userLog);
        
        RestTemplate template = new RestTemplate();
        // Message Converters
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(new SourceHttpMessageConverter<Source>());
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(new MappingJacksonHttpMessageConverter());
        template.setMessageConverters(messageConverters);

        
        ResultadoOCW response = template.getForObject("http://carbono.utpl.edu.ec:8080/WSSearcher/webresources/serendipityrest?q=" + q, ResultadoOCW.class);

        for (ItemOcw item : response.getItemsOcw()) {
            //Buscar posicion del igual en la uri para obtener el id para luego buscar en el detalle
            int posicionIgual = item.getUri().indexOf("=");
            item.setIdCourse(item.getUri().substring(posicionIgual + 1));
        }
        
        model.addAttribute("resultados", response);
        model.addAttribute("items", response.getItemsOcw());
        return "resultado";
    }
    
    @RequestMapping(value = "/detallar")
    public String detallar(int id, ModelMap model) {
        RestTemplate template = new RestTemplate();
        // Message Converters
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(new SourceHttpMessageConverter<Source>());
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(new MappingJacksonHttpMessageConverter());
        template.setMessageConverters(messageConverters);

        
        ResultadoDetalleOCW response = template.getForObject("http://carbono.utpl.edu.ec:8080/WSSearcher/webresources/serendipityrest/course?id=" + id, ResultadoDetalleOCW.class);
        model.addAttribute("resultados", response);
        model.addAttribute("items", response.getItemDetalleOCW());
        return "detalle";
    }
    
    @RequestMapping(value = "/similar")
    public String similar(int id, ModelMap model) {
        RestTemplate template = new RestTemplate();
        // Message Converters
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(new SourceHttpMessageConverter<Source>());
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(new MappingJacksonHttpMessageConverter());
        template.setMessageConverters(messageConverters);

        
        ResultadoSimilar response = template.getForObject("http://carbono.utpl.edu.ec:8080/WSSearcher/webresources/serendipityrest/similar?id=" + id, ResultadoSimilar.class);
        model.addAttribute("resultados", response);
        model.addAttribute("items", response.getItemSimilar());
        return "similar";
    }
}
