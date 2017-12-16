package br.edu.uea.Genero;

import br.edu.uea.SPW.SupermercadoWeb;

public abstract class Genero {
	protected String nome;
	private SupermercadoWeb supermercadoWeb;
	
	public Genero(){}
	public Genero(String nome){
		this.nome = nome;
	}
	public SupermercadoWeb getSupermercadoWeb() {
		return supermercadoWeb;
	}
	public void setSupermercadoWeb(SupermercadoWeb supermercadoWeb) {
		this.supermercadoWeb = supermercadoWeb;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}