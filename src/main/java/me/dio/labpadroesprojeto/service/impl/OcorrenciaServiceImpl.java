package me.dio.labpadroesprojeto.service.impl;

import me.dio.labpadroesprojeto.model.*;
import me.dio.labpadroesprojeto.repository.*;
import me.dio.labpadroesprojeto.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class OcorrenciaServiceImpl implements OcorrenciaServiceFacade {

    @Autowired private OcorrenciaRepository ocorrenciaRepository;
    @Autowired private EnderecoRepository enderecoRepository;
    @Autowired private ViaCepService viaCepService;
    @Autowired private Map<String, TratamentoOcorrenciaStrategy> estrategias;

    @Override
    public Iterable<Ocorrencia> buscarTodos() { return ocorrenciaRepository.findAll(); }

    @Override
    public void inserir(Ocorrencia ocorrencia) {
        String cep = ocorrencia.getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novo = viaCepService.consultarCep(cep);
            enderecoRepository.save(novo);
            return novo;
        });
        ocorrencia.setEndereco(endereco);
        ocorrenciaRepository.save(ocorrencia);

        String sev = ocorrencia.getSeveridade().toUpperCase();
        estrategias.getOrDefault(sev, (o) -> System.out.println("Log padrão.")).tratar(ocorrencia);
    }
}
