package com.SistemaDeCadastro.cadastro.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "pacientes")

public class PacientesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_paciente")
    private Long id_consulta;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "paciente")
    private MedicoEntity medicoEntity;

    @OneToMany(mappedBy = "paciente")
    private List<ConsultasEntity> consultasEntities;

    public Long getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MedicoEntity getMedicoEntity() {
        return medicoEntity;
    }

    public void setMedicoEntity(MedicoEntity medicoEntity) {
        this.medicoEntity = medicoEntity;
    }

    public List<ConsultasEntity> getConsultasEntities() {
        return consultasEntities;
    }

    public void setConsultasEntities(List<ConsultasEntity> consultasEntities) {
        this.consultasEntities = consultasEntities;
    }


    

}
