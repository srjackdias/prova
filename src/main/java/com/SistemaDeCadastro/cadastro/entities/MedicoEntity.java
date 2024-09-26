package com.SistemaDeCadastro.cadastro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name ="Medicos")
public class MedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "id_Medico")
    private Long id_Medico;


    @Column(name = "nomemedico")
    private String nomeMedico;

    @Column(name = "especialidade")
    private String especialidade;

    
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacientesEntity paciente;


    public Long getId_Medico() {
        return id_Medico;
    }


    public void setId_Medico(Long id_Medico) {
        this.id_Medico = id_Medico;
    }


    public String getNomeMedico() {
        return nomeMedico;
    }


    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }


    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public PacientesEntity getPaciente() {
        return paciente;
    }


    public void setPaciente(PacientesEntity paciente) {
        this.paciente = paciente;
    }


    
    


}
