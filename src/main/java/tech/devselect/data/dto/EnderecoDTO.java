package tech.devselect.data.dto;

import tech.devselect.data.entity.Endereco;

public class EnderecoDTO {

	private String cepEndereco;
	private String logradouroEndereco;
	private String numeroEndereco;
	private String bairroEndereco;
	private String cidadeEndereco;
	private String estadoEndereco;
	
	public EnderecoDTO() { }

	public EnderecoDTO(String cepEndereco, String logradouroEndereco, String numeroEndereco, String bairroEndereco,
			String cidadeEndereco, String estadoEndereco) {
		super();
		this.cepEndereco = cepEndereco;
		this.logradouroEndereco = logradouroEndereco;
		this.numeroEndereco = numeroEndereco;
		this.bairroEndereco = bairroEndereco;
		this.cidadeEndereco = cidadeEndereco;
		this.estadoEndereco = estadoEndereco;
	}
	
	public Endereco convertToEntity() {
	return new Endereco(
			getCepEndereco(), getLogradouroEndereco(), getNumeroEndereco(),
			getBairroEndereco(), getCidadeEndereco(), getEstadoEndereco());
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getLogradouroEndereco() {
		return logradouroEndereco;
	}

	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getEstadoEndereco() {
		return estadoEndereco;
	}

	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}
	
}
