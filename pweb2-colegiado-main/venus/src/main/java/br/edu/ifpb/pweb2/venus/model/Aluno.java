package br.edu.ifpb.pweb2.venus.model;

public class Aluno {
    //@Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String fone;

    private String matricula;

    private String login;

    private String senha;
    
    public Reuniao consultarReuniao(Reuniao reuniao) {
        return reuniao;
    }
}
