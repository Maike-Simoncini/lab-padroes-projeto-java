package me.dio.labpadroesprojeto.service.impl;

import me.dio.labpadroesprojeto.service.TratamentoOcorrenciaStrategy;
import me.dio.labpadroesprojeto.model.Ocorrencia;
import org.springframework.stereotype.Service;

@Service("BAIXA")
public class TratamentoBaixaPrioridade implements TratamentoOcorrenciaStrategy {
    @Override
    public void tratar(Ocorrencia ocorrencia) {
        System.out.println("Relatório: Ocorrência de rotina registrada para: " + ocorrencia.getDescricao());
    }
}
