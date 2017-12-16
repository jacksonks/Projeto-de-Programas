package br.edu.uea.genero;

public class Leite extends Genero {
	
	public Leite(){}
	public Leite(String nome){
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
