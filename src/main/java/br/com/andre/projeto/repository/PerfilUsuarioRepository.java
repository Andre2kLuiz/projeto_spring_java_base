package br.com.andre.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andre.projeto.entity.PerfilUsuarioEntity;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {
    
}
