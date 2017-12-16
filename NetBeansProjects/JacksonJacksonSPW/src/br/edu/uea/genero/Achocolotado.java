package br.edu.uea.genero;

public class Achocolotado extends Genero {

	public Achocolotado() {}

	public Achocolotado(String nome) {
		super(nome);
	}
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;

	}

	

}
