/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.search.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author criss
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemOcw {

    @JsonProperty("title")
    private String titulo;
    @JsonProperty("url")
    private String url;
    @JsonProperty("language")
    private String lenguaje;
    @JsonProperty("university_name")
    private String universidad;
    @JsonProperty("university_url")
    private String universidadUrl;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getUniversidadUrl() {
        return universidadUrl;
    }

    public void setUniversidadUrl(String universidadUrl) {
        this.universidadUrl = universidadUrl;
    }
}
