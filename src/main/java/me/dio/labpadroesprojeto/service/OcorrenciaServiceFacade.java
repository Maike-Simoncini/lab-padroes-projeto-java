package me.dio.labpadroesprojeto.service;

import me.dio.labpadroesprojeto.model.Ocorrencia;

public interface OcorrenciaServiceFacade {
    Iterable<Ocorrencia> buscarTodos();
    Ocorrencia buscarPorId(Long id);
    void inserir(Ocorrencia ocorrencia);
    void deletar(Long id);
}
