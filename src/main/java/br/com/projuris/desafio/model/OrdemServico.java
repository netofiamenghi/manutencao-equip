package br.com.projuris.desafio.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrdemServico {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeCliente;
	private String enderecoCliente;
	private String telefoneCliente;
	private String emailCliente;
	private String tipoEquipamento;
	private String marcaEquipamento;
	private String problemaEquipamento;
	@Enumerated(EnumType.STRING)
	private StatusOrdemServico status;
	private String detalheExecucao;
	
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
	public StatusOrdemServico getStatus() {
		return status;
	}
	public void setStatus(StatusOrdemServico status) {
		this.status = status;
	}
	public String getDetalheExecucao() {
		return detalheExecucao;
	}
	public void setDetalheExecucao(String detalheExecucao) {
		this.detalheExecucao = detalheExecucao;
	}
	 
	
	
	
	

}
