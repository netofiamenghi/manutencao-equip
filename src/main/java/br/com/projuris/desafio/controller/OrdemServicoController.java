package br.com.projuris.desafio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projuris.desafio.dto.RequisicaoNovaOrdem;
import br.com.projuris.desafio.model.OrdemServico;
import br.com.projuris.desafio.repository.OrdemServicoRepository;

@Controller
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoRepository ordemRepository;
	
	@GetMapping
	@RequestMapping("formulario")
	public String formulario(RequisicaoNovaOrdem requisicao) {
		
		return "formulario";
	}
	
	@PostMapping
	@RequestMapping("salvar")
	public String salvar(@Valid RequisicaoNovaOrdem requisicao, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "formulario";
		}
		
		OrdemServico ordem = requisicao.toOrdemServico();
		ordemRepository.save(ordem);
		
		return "ordens";
	}
	
	@GetMapping("carregar/{id}")
	public String carregar(@PathVariable("id") String id, Model model) {
		
		long x = Long.valueOf(id);
		
		OrdemServico ordem = (OrdemServico) ordemRepository.findById(x);
		model.addAttribute("requisicaoNovaOrdem", ordem);
		
		return "formulario";
	}
	
	@GetMapping("ordens")
	public String ordens() {
		return "ordens";
	}
	
	@GetMapping("novas")
	public String novas() {
		return "novas";
	}
	
	@GetMapping("iniciadas")
	public String iniciadas() {
		return "iniciadas";
	}
	
	@GetMapping("pendentes")
	public String pendentes() {
		return "pendentes";
	}
	
	@GetMapping("finalizadas")
	public String finalizadas() {
		return "finalizadas";
	}

}
