/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso_practico1.Caso_Practico1.Service;

import com.caso_practico1.Caso_Practico1.Entity.Peliculas;
import com.caso_practico1.Caso_Practico1.Repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mathias
 */
@Service
public class PeliculaService implements Ipeliculaservice {

    @Autowired
    private PeliculaRepository PeliculaRepository;
    
    @Override
    public List<Peliculas> getAllPeliculas() {
    return (List <Peliculas>) PeliculaRepository.findAll();
    }

    @Override
    public Peliculas getPeliculasByID(long id) {
     return PeliculaRepository.findById(id).orElse(null);   
    }

    @Override
    public void savePersona(Peliculas peliculas) {
        PeliculaRepository.save(peliculas);
    }

    @Override
    public void delete(long id) {
        PeliculaRepository.deleteById(id);
    }

    
}
