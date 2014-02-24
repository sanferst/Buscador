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
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("university_name")
    private String universidad;
    
    @JsonProperty("description")
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
    
    @JsonProperty("language")
    private String language;
    
    @JsonProperty("textConcat")
    private String textConcat;
    
    @JsonProperty("score")
    private String score;

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getContinet() {
        return continet;
    }

    public void setContinet(String continet) {
        this.continet = continet;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResourseType() {
        return resourseType;
    }

    public void setResourseType(String resourseType) {
        this.resourseType = resourseType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTextConcat() {
        return textConcat;
    }

    public void setTextConcat(String textConcat) {
        this.textConcat = textConcat;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

   
}
