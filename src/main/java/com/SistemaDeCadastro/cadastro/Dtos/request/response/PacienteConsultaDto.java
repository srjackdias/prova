package com.SistemaDeCadastro.cadastro.Dtos.request.response;

import java.util.Date;

public class PacienteConsultaDto {
    
    private String nome;
    private String nomeMedico;
    private String especialidade;
    private static Date data;
    private static String descricao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    public static Date getData() {
        return data;
    }
    public void setData(Date data) {
        PacienteConsultaDto.data = data;
    }
    public static String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        PacienteConsultaDto.descricao = descricao;
    }
   

    



}
