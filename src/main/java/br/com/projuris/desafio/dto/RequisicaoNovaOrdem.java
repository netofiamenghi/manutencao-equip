package br.com.projuris.desafio.dto;

import javax.validation.constraints.NotBlank;

import br.com.projuris.desafio.model.OrdemServico;
import br.com.projuris.desafio.model.StatusOrdemServico;

public class RequisicaoNovaOrdem {
	
	private Long id;
	@NotBlank
	private String nomeCliente;
	@NotBlank
	private String enderecoCliente;
	@NotBlank
	private String telefoneCliente;
	@NotBlank
	private String emailCliente;
	@NotBlank
	private String tipoEquipamento;
	@NotBlank
	private String marcaEquipamento;
	@NotBlank
	private String problemaEquipamento;
	private String detalheExecucao;
	private StatusOrdemServico status;
	
	public void setStatus(StatusOrdemServico status) {
		this.status = status;
	}
	
	public StatusOrdemServico getStatus() {
		return status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public String getMarcaEquipamento() {
		return marcaEquipamento;
	}

	public void setMarcaEquipamento(String marcaEquipamento) {
		this.marcaEquipamento = marcaEquipamento;
	}

	public String getProblemaEquipamento() {
		return problemaEquipamento;
	}

	public void setProblemaEquipamento(String problemaEquipamento) {
		this.problemaEquipamento = problemaEquipamento;
	}

	public String getDetalheExecucao() {
		return detalheExecucao;
	}

	public void setDetalheExecucao(String detalheExecucao) {
		this.detalheExecucao = detalheExecucao;
	}

	public OrdemServico toOrdemServico() {

		OrdemServico ordemServico = new OrdemServico();
		ordemServico.setId(id);
		ordemServico.setNomeCliente(nomeCliente);
		ordemServico.setEnderecoCliente(enderecoCliente);
		ordemServico.setTelefoneCliente(telefoneCliente);
		ordemServico.setEmailCliente(emailCliente);
		ordemServico.setTipoEquipamento(tipoEquipamento);
		ordemServico.setMarcaEquipamento(marcaEquipamento);
		ordemServico.setProblemaEquipamento(problemaEquipamento);
		ordemServico.setDetalheExecucao(detalheExecucao);
		ordemServico.setStatus(status);

		return ordemServico;
	}

}
