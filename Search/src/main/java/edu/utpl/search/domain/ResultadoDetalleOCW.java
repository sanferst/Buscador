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
 * @author Santiago
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoDetalleOCW {
    @JsonProperty("q")
    private String query;
    @JsonProperty("date")
    private String fecha;
    @JsonProperty("version")
    private String version;
    @JsonProperty("rows")
    private int rows;
    @JsonProperty("time")
    private double time;
    @JsonProperty("results")
    private List<ItemDetalleOCW> itemDetalleOCW;

    public String getQuery() {
        return query;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVersion() {
        return version;
    }

    public int getRows() {
        return rows;
    }

    public double getTime() {
        return time;
    }

    public List<ItemDetalleOCW> getItemDetalleOCW() {
        return itemDetalleOCW;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setItemDetalleOCW(List<ItemDetalleOCW> itemDetalleOCW) {
        this.itemDetalleOCW = itemDetalleOCW;
    }
}

