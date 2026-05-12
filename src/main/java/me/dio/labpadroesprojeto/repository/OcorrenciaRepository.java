// OcorrenciaRepository.java
package me.dio.labpadroesprojeto.repository;
import org.springframework.data.repository.CrudRepository;
import me.dio.labpadroesprojeto.model.Ocorrencia;
public interface OcorrenciaRepository extends CrudRepository<Ocorrencia, Long> {}
