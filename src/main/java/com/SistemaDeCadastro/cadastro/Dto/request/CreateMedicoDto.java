package com.SistemaDeCadastro.cadastro.Dto.request;

public class CreateMedicoDto {
    

    private String nomeMedico;
    private String especialidade;

    
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


    
}