package com.senai.revisao.controllers;

import java.util.List;



public class PacienteController(){


    @Autowired   
    
    PacienteService pacienteService;

    @PostMappíng
    public ResponseEntity <?>CreatePaciente(@RequestBody createPacienteDto dto){

        System.out.println(dto.getNome());
        System.out.println(dto.getMedico().getNome());
        System.out.println(dto.getConsultas().get(0).getNome());


        pacienteService.CreatePaciente(dto)

        return ResponseEntity.status(201).build();




    }
}