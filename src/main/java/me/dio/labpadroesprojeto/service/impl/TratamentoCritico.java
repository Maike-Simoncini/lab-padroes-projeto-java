package me.dio.labpadroesprojeto.service.impl;

import me.dio.labpadroesprojeto.service.TratamentoOcorrenciaStrategy;
import me.dio.labpadroesprojeto.model.Ocorrencia;
import org.springframework.stereotype.Service;

@Service("CRITICA")
public class TratamentoCritico implements TratamentoOcorrenciaStrategy {
    @Override
    public void tratar(Ocorrencia ocorrencia) {
        System.out.println("🚨 ALERTA CRÍTICO: Protocolo de segurança nível 1 acionado para: " + ocorrencia.getDescricao());
    }
}
