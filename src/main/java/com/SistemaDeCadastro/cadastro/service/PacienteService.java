package com.SistemaDeCadastro.cadastro.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SistemaDeCadastro.cadastro.Dto.request.CreateConsultasDto;
import com.SistemaDeCadastro.cadastro.Dto.request.CreatePacienteDto;
import com.SistemaDeCadastro.cadastro.Dto.resp.ShowConsultasDto;
import com.SistemaDeCadastro.cadastro.Dto.resp.ShowMedicoDto;
import com.SistemaDeCadastro.cadastro.Dto.resp.ShowPacienteDto;
import com.SistemaDeCadastro.cadastro.entities.ConsultasEntity;
import com.SistemaDeCadastro.cadastro.entities.MedicoEntity;
import com.SistemaDeCadastro.cadastro.entities.PacientesEntity;
import com.SistemaDeCadastro.cadastro.repository.ConsultasRepository;
import com.SistemaDeCadastro.cadastro.repository.MedicoRepository;
import com.SistemaDeCadastro.cadastro.repository.PacienteRepository;


@Service
public class PacienteService {
    


    @Autowired

    ConsultasRepository consultasRepository;

    @Autowired

    MedicoRepository medicoRepository;


    @Autowired

    PacienteRepository pacienteRepository;

    public void CreatePaciente(CreatePacienteDto dto){

        PacientesEntity pacientesEntity = new PacientesEntity();
        pacientesEntity.setNome(dto.getNome());

        pacientesEntity= pacienteRepository.save(pacientesEntity);

        MedicoEntity medicoEntity = new MedicoEntity();
        medicoEntity.setNomeMedico(dto.getMedico().getNomeMedico());
        medicoEntity.setEspecialidade(dto.getMedico().getEspecialidade());

        medicoEntity= medicoRepository.save(medicoEntity);


         List<ConsultasEntity> consultasEntities = new ArrayList<>();

    
        for(CreateConsultasDto consultasDto : dto.getConsultas()){

            ConsultasEntity consultasEntity = new ConsultasEntity();
            consultasEntity.setData(consultasDto.getData());
            consultasEntity.setDescricao(consultasDto.getDescricao());
            consultasEntity.setPaciente(pacientesEntity);


            consultasEntities.add(consultasEntity);

        }
        

        consultasRepository.saveAll(consultasEntities);


    }

    public List<ShowPacienteDto> getAllPacientes(){
        List <PacientesEntity> pacientesEntity = pacienteRepository.findAll();



        return pacientesEntity

        .stream()
        .map( paciente -> {
        ShowPacienteDto pacienteDTO = new ShowPacienteDto();
        ShowMedicoDto medicoDTO =  new ShowMedicoDto();
        List<ShowConsultasDto> consultasDTO =  new ArrayList<>();


        for(ConsultasEntity consultasEntity : paciente.getConsultas()) {
            ShowConsultasDto consultaDTO =  new ShowConsultasDto();
            consultaDTO.setData(consultasEntity.getData());
            consultaDTO.setDescricao(consultasEntity.getDescricao());
            consultasDTO.add(consultaDTO);



        }

        medicoDTO.setNomeMedico(paciente.getMedico().getNomeMedico());
        medicoDTO.setEspecialidade(paciente.getMedico().getEspecialidade());

     

        pacienteDTO.setId_paciente( paciente.getId_paciente());
        pacienteDTO.setNome( paciente.getNome());
        pacienteDTO.setMedico(medicoDTO);   
        pacienteDTO.setConsultas(consultasDTO);



        return pacienteDTO;
        }).toList();


    }



        

}





    