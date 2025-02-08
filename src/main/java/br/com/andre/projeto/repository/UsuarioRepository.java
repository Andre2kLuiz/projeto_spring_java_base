package br.com.andre.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andre.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    
}
