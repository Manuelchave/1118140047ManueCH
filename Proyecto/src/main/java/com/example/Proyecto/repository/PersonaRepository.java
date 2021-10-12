package com.example.Proyecto.repository;

import com.example.Proyecto.model.Persona;
import org.springframework.data.jpa.repository.*;
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
