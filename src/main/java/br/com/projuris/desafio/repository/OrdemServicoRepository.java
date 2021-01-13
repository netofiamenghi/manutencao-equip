package br.com.projuris.desafio.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projuris.desafio.model.OrdemServico;
import br.com.projuris.desafio.model.StatusOrdemServico;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

	@Cacheable("ordens")
	List<OrdemServico> findByStatus(StatusOrdemServico status);

	OrdemServico findById(long id);

}
