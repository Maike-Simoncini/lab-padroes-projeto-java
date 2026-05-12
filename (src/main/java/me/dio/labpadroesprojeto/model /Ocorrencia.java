package me.dio.labpadroesprojeto.model;

import jakarta.persistence.*;

@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private String severidade;
    private String cep;

    @ManyToOne
    private Endereco endereco;

    // Getters e Setters
    public Long getId() { return id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String d) { this.descricao = d; }
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String s) { this.severidade = s; }
    public String getCep() { return cep; }
    public void setCep(String c) { this.cep = c; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco e) { this.endereco = e; }
}
