/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso_practico1.Caso_Practico1.Repository;

import com.caso_practico1.Caso_Practico1.Entity.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mathias
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Peliculas,Long> {
    
}