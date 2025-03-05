package br.com.andre.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.andre.projeto.entity.PerfilEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PerfilDTO {
    
    private Long id;
    private String descricao;

    public PerfilDTO(PerfilEntity perfil) {
        BeanUtils.copyProperties(perfil, this);
    }
}
