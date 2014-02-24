/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.search.domain;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Santiago
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class ItemSimilar implements Serializable {
    @JsonProperty("store")
    private String store;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("Id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("university_name")
    private String universidad;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("license")
    private String license;
    @JsonProperty("continent")
    private String continet;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("image")
    private String image;
    @JsonProperty("resourseType")
    private String resourseType;
    @JsonProperty("resourseType")
    private String address;
    @JsonProperty("languaje")
    private String languaje;
    @JsonProperty("TextConcat")
    private String TextConcat;
    @JsonProperty("score")

    public String getStore() {
        return store;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getDescription() {
        return description;
    }

    public String getLicense() {
        return license;
    }

    public String getContinet() {
        return continet;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getImage() {
        return image;
    }

    public String getResourseType() {
        return resourseType;
    }

    public String getAddress() {
        return address;
    }

    public String getLanguaje() {
        return languaje;
    }

    public String getTextConcat() {
        return TextConcat;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setContinet(String continet) {
        this.continet = continet;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setResourseType(String resourseType) {
        this.resourseType = resourseType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLanguaje(String languaje) {
        this.languaje = languaje;
    }

    public void setTextConcat(String TextConcat) {
        this.TextConcat = TextConcat;
    }
}
