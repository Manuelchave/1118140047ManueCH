package com.example.Proyecto.rest;


import com.example.Proyecto.Service.HerramientaService;
import com.example.Proyecto.model.Herramienta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/herramienta/")
public class HerramientaREST {

    @Autowired
    private HerramientaService herramientaService;

    @PostMapping
    private ResponseEntity<Herramienta> guardar (@RequestBody Herramienta herramienta){
        Herramienta temporal = herramientaService.create(herramienta);
        try {
            return  ResponseEntity.created(new URI("/api/herramienta"+temporal.getidH())).body(temporal);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping
    private ResponseEntity<List<Herramienta>> ListaDeHerramientas (){
        return ResponseEntity.ok(herramientaService.getAllHerramientas());

    }
    @DeleteMapping
    private ResponseEntity<Void> eliminarHerramientas (@RequestBody Herramienta herramienta){
        herramientaService.delete(herramienta);
        return ResponseEntity.ok().build();
    }
    @GetMapping (value = "{idH}")
    private ResponseEntity<Optional<Herramienta>> ListaDeTodasLasHerramientas (@PathVariable("idH") Long idH){
        return ResponseEntity.ok(herramientaService.findById(idH));
    }
}
