package com.SistemaDeCadastro.cadastro.Dto.request;
import java.util.Date;

public class CreateConsultasDto {

    private Date data;
    private String descricao;
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
 
   
}
