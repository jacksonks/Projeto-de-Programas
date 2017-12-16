package br.edu.uea.genero;

public class Presunto extends Genero {
	
	public Presunto(){}
	public Presunto(String nome){
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
