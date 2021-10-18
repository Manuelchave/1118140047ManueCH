package com.example.Proyecto.Service;


import com.example.Proyecto.model.Herramienta;
import com.example.Proyecto.repository.HerramientaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HerramientaService {
    @Autowired
    private HerramientaRepository herramientaRepository;

    public Herramienta create (Herramienta herramienta){return herramientaRepository.save(herramienta);}

    public List<Herramienta> getAllHerramientas(){return herramientaRepository.findAll();}

    public void delete (Herramienta herramienta) {
        herramientaRepository.delete(herramienta);
    }

    public Optional<Herramienta> findById (Long idH){return herramientaRepository.findById(idH);}

}
