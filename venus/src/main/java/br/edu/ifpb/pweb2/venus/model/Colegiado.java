package br.edu.ifpb.pweb2.venus.model;

import java.util.Date;

public class Colegiado {
    //id: int, dataInicio: date, dataFim: date, descricao: str,
    //portaria: str, curso: str

    //@Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Date dataInicio;

    private Date dataFim;

    private String descricao;

    private String portaria;

    private String curso;

}
