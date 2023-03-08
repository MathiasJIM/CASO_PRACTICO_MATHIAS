/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso_practico1.Caso_Practico1.Service;
import com.caso_practico1.Caso_Practico1.Entity.Peliculas;
import java.util.List;

/**
 *
 * @author Mathias
 */
public interface Ipeliculaservice {
    public List <Peliculas> getAllPeliculas();
    public Peliculas getPeliculasByID (long id);
    public void savePersona(Peliculas peliculas);
    public void delete (long id);
}
