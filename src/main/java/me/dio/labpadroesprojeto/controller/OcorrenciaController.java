package me.dio.labpadroesprojeto.controller;

import me.dio.labpadroesprojeto.model.Ocorrencia;
import me.dio.labpadroesprojeto.service.OcorrenciaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller que expõe os endpoints para gestão de ocorrências de segurança.
 * Demonstra a utilização do padrão Singleton (Bean do Spring).
 */
@RestController
@RequestMapping("ocorrencias")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaServiceFacade ocorrenciaService;

    @GetMapping
    public ResponseEntity<Iterable<Ocorrencia>> buscarTodos() {
        return ResponseEntity.ok(ocorrenciaService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(ocorrenciaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Ocorrencia> inserir(@RequestBody Ocorrencia ocorrencia) {
        ocorrenciaService.inserir(ocorrencia);
        return ResponseEntity.ok(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        ocorrenciaService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
