package br.edu.ifpb.pweb2.venus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String fone;

    @NotBlank(message = "Campo Obrigatório")
    private String matricula;

    private String login;

    private String senha;
    
    public Reuniao consultarReuniao(Reuniao reuniao) {
        return reuniao;
    }
}
