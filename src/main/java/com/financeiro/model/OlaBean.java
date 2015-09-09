package com.financeiro.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ola")
public class OlaBean {

	public OlaBean() {

	}

	public OlaBean(String nome, String sobreNome, String nomeCompleto) {

		this.nome = nome;
		this.sobreNome = sobreNome;

	}

	public void dizerOla() {

		this.nomeCompleto = this.nomeCompleto.toUpperCase() + " "
				+ this.sobreNome;
	}

	private String nome;
	private String sobreNome;
	private String nomeCompleto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

}
