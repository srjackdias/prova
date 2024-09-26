package com.SistemaDeCadastro.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaDeCadastro.cadastro.entities.ConsultasEntity;
import com.SistemaDeCadastro.cadastro.entities.PacientesEntity;

public interface PacienteRepository  extends JpaRepository<PacientesEntity,Long>{

    static void save(ConsultasEntity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
