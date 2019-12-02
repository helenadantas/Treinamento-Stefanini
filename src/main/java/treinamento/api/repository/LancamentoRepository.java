package treinamento.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import treinamento.api.model.Lancamento;

public interface LancamentoRepository  extends JpaRepository<Lancamento, Long> {

}
