package br.edu.uea.produto;

import br.edu.uea.genero.Genero;
import br.edu.uea.marca.Marca;
import br.edu.uea.spw.SupermercadoWeb;

public class Produto {
	private int codigo;
	private String nome;
	private float preco;
	
	private Marca marca;
	private Genero genero;
	private SupermercadoWeb supermercadoWeb;
	
	public Produto(){}
	public Produto(int codigo, String nome, float preco, Marca marca, Genero genero){
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		setMarca(marca);
		setGenero(genero);
	}
	
	
	public SupermercadoWeb getSupermercadoWeb() {
		return supermercadoWeb;
	}
	public void setSupermercadoWeb(SupermercadoWeb supermercadoWeb) {
		this.supermercadoWeb = supermercadoWeb;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}	

}
