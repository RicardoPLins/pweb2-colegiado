package br.edu.ifpb.pweb2.venus.model;

import java.util.Date;
import java.util.List;

public class Processo {
    //@Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String numero;

    private Date dataRecepcao;

    private Date dataDistribuicao;

    private Date dataParecer;

    private byte[] parecer;

    private TipoDecisao decisaoRelator;
}
