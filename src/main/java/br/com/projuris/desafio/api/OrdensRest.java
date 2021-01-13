package br.com.projuris.desafio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projuris.desafio.model.OrdemServico;
import br.com.projuris.desafio.model.StatusOrdemServico;
import br.com.projuris.desafio.repository.OrdemServicoRepository;

@RestController
@RequestMapping("/api/ordens")
public class OrdensRest {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@GetMapping("todas")
	public List<OrdemServico> getOrdensTodas(){
		return ordemServicoRepository.findAll();
	}
	
	@GetMapping("novas")
	public List<OrdemServico> getOrdensNovas(){
		return ordemServicoRepository.findByStatus(StatusOrdemServico.valueOf("NOVA"));
	}
	
	@GetMapping("iniciadas")
	public List<OrdemServico> getOrdensIniciadas(){
		return ordemServicoRepository.findByStatus(StatusOrdemServico.valueOf("INICIADA"));
	}
	
	@GetMapping("pendentes")
	public List<OrdemServico> getOrdensPendentes(){
		return ordemServicoRepository.findByStatus(StatusOrdemServico.valueOf("PENDENTE"));
	}
	
	@GetMapping("finalizadas")
	public List<OrdemServico> getOrdensFinalizadas(){
		return ordemServicoRepository.findByStatus(StatusOrdemServico.valueOf("FINALIZADA"));
	}

}
