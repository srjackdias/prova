package com.SistemaDeCadastro.cadastro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SistemaDeCadastro.cadastro.service.ConsultasService;



@RestController
@RequestMapping("/paciente")
public class PacienteConsulta {
    


    
    @Autowired
    ConsultasService ConsultasService;

    @GetMapping
    
    public ResponseEntity<?> getTimes() {

       var times = ConsultasService.getAlltimes();

        return ResponseEntity.ok(times);

    }
}
