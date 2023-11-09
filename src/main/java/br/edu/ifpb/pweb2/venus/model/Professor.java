package br.edu.ifpb.pweb2.venus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String fone;

    private String matricula;

    private String login;

    @NotEmpty(message = "A senha é obrigatória")
    private String senha;
    
    private Boolean coordenador;

    public void consultarListaSeusProcessos(){

    }
    public void RedigirParecerProcessos(){

    }
    
}
