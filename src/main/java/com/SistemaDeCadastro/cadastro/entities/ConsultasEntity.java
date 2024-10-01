package com.SistemaDeCadastro.cadastro.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name ="consultas")
public class ConsultasEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


     @Column(name ="id_consulta")
     private Long id_consulta;

     @Column(name ="data")
     private Date  data;

     @Column(name ="descricao")
     private String descricao;

     @ManyToOne
     @JoinColumn(name = "paciente_id")
     private PacientesEntity paciente;

    public Long getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PacientesEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacientesEntity paciente) {
        this.paciente = paciente;
    }


 

   

     
}
