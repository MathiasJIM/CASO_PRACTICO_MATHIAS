/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso_practico1.Caso_Practico1.Controller;

import com.caso_practico1.Caso_Practico1.Entity.Peliculas;
import com.caso_practico1.Caso_Practico1.Entity.Sala;
import com.caso_practico1.Caso_Practico1.Service.Ipeliculaservice;
import com.caso_practico1.Caso_Practico1.Service.Isalaservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Mathias
 */
@Controller
public class Peliculas_Controller {
     @Autowired
    private Ipeliculaservice PeliculaService;

    @Autowired
    private Isalaservice SalaService;
    
    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Peliculas> listaPelicula = PeliculaService.getAllPeliculas();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";
    }
    
    @GetMapping("/addpeliculas")
    public String crearPeliculas(Model model) {
        List<Sala> listaSala = SalaService.listSala();
        model.addAttribute("peliculas", new Sala());
        model.addAttribute("sala", listaSala);
        return "sala";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPelicula) {
        PeliculaService.delete(idPelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/editPelicula/{id}")
    public String editarPersona(@PathVariable("id")Long idPelicula,Model model){
        Peliculas pelicula = PeliculaService.getPeliculasByID(idPelicula);
        List<Sala> listaSala = SalaService.listSala();
        model.addAttribute("sala", pelicula);
        model.addAttribute("sala", listaSala);
        return "sala";
    }
}
