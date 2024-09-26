package com.SistemaDeCadastro.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SistemaDeCadastro.cadastro.Dtos.request.response.PacienteConsultaDto;
import com.SistemaDeCadastro.cadastro.entities.ConsultasEntity;
import com.SistemaDeCadastro.cadastro.repository.PacienteRepository;

@Service
public class ConsultasService {
    

    @Autowired

    PacienteRepository pacienteRepository;

    public List<ConsultasEntity>getAlltimes(){


        return ConsultasEntity.findAll();
    }


    public void CreatePaciente(PacienteConsultaDto pacienteConsultaDto){

        ConsultasEntity entity = new ConsultasEntity();
        entity.setData(PacienteConsultaDto.getData());
        entity.setDescricao(PacienteConsultaDto.getDescricao());
     

        PacienteRepository.save(entity);


    }

}
