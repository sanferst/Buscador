/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.search.domain;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoOCW {

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
    private List<ItemOcw> itemsOcw;

    public List<ItemOcw> getItemsOcw() {
        return itemsOcw;
    }

    public void setItemsOcw(List<ItemOcw> itemsOcw) {
        this.itemsOcw = itemsOcw;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

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

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
     public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
