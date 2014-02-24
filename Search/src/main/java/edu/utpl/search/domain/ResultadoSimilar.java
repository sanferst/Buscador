/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.search.domain;

import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Santiago
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoSimilar implements Serializable {
    
    @JsonProperty("q")
    private String query;
    
    @JsonProperty("date")
    private String fecha;
    
    @JsonProperty("version")
    private String version;
    
    @JsonProperty("rows")
    private int rows;
    
    @JsonProperty("time")
    private double tiempo;
    
    @JsonProperty("results")
    private List<ItemSimilar> itemSimilar;

    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public List<ItemSimilar> getItemSimilar() {
        return itemSimilar;
    }

    public void setItemSimilar(List<ItemSimilar> itemSimilar) {
        this.itemSimilar = itemSimilar;
    }

    
   
}
