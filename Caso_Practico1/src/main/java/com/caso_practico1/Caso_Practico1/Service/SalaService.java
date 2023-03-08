/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso_practico1.Caso_Practico1.Service;
import com.caso_practico1.Caso_Practico1.Entity.Sala;
import com.caso_practico1.Caso_Practico1.Repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mathias
 */
@Service
public class SalaService implements Isalaservice {

    @Autowired
    private SalaRepository SalaRepository;
    @Override
    public List<Sala> listSala() {
        return (List<Sala>) SalaRepository.findAll();
    }
    
}
