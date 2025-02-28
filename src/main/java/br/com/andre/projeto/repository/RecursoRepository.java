package br.com.andre.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andre.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{
    
}
