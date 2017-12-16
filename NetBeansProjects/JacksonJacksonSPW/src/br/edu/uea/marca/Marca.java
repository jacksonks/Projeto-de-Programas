package br.edu.uea.marca;

import br.edu.uea.spw.SupermercadoWeb;

public class Marca {
	private String nome;
	private SupermercadoWeb supermercadoWeb;
	
	public Marca(){}
	public Marca(String nome){
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
