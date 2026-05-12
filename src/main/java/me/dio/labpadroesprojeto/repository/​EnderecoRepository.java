package me.dio.labpadroesprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    // Getters e Setters
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
    public String getLocalidade() { return localidade; }
    public void setLocalidade(String localidade) { this.localidade = localidade; }
}
