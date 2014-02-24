package edu.utpl.search.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity(name = "log")
public class UserLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String busqueda;

    public UserLog() {
    }
    
    public UserLog(String username) {
        this.username = username;
    }

    public UserLog(String username, Date fecha, String busqueda) {
        this.username = username;
        this.fecha = fecha;
        this.busqueda = busqueda;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

   
}
