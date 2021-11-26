package br.com.isaac.crudserie.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "serie")
public class Serie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", length = 30, nullable = false)
    private String nome;

    @Column(name = "genero", length = 30, nullable = false)
    private String genero;

    @Column(length = 30, nullable = false)
    private String pais;

    //------------------------------------****--------------------------------------//
    // add a V2
    @Column(name = "ano")
    private Integer ano;

    @Column(name = "duracao")
    private String duracao;


    //-----------------------------------****---------------------------------------//
    public Serie() {
    }

    public Serie(long id, String nome, String genero, String pais, Integer ano, String duracao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
        this.duracao = duracao;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public String getPais() { return pais; }

    public void setPais(String pais) { this.pais = pais; }

    public Integer getAno() { return ano; }

    public void setAno(Integer ano) { this.ano = ano; }

    public String getDuracao() { return duracao; }

    public void setDuracao(String duracao) { this.duracao = duracao; }
}
