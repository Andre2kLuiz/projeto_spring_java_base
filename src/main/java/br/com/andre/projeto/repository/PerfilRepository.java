package br.com.andre.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andre.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long>{
  
} 
