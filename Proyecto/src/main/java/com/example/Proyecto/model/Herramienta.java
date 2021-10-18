package com.example.Proyecto.model;

import javax.persistence.*;

@Entity
@Table(name = "herramienta")

public class Herramienta {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idH;
    private String tipo;
    private String modelo;
    private String precio;
    private String ubicacion;

    public Herramienta(Long idH, String tipo, String modelo, String precio, String ubicacion) {
        this.idH = idH;
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
        this.ubicacion = ubicacion;

    }

    public Long getidH() {
        return idH;
    }

    public void setidH(Long idH) {
        this.idH = idH;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
