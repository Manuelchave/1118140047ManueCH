package com.example.Proyecto.model;


import javax.persistence.*;

@Entity
@Table(name = "persona")

public class Persona  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String nom;
    private String cel;
    private String email;

    public Persona(Long id, String nom, String cel, String email) {
        this.id = id;
        this.nom = nom;
        this.cel = cel;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
