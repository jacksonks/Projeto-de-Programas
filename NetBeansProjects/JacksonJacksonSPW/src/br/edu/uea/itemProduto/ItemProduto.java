package br.edu.uea.itemProduto;
import java.util.Date;
import java.util.GregorianCalendar;

import br.edu.uea.carrinho.Carrinho;
import br.edu.uea.data.Data;
import br.edu.uea.estoque.Estoque;
import br.edu.uea.produto.Produto;

public class ItemProduto {
	
	private int codigo;
	private Data validade;	
	private Produto produto;
	private Carrinho carrinho;
	private Estoque estoque;

	public ItemProduto(){}
	public ItemProduto(int codigo, Data validade, Produto produto){
		setProduto(produto);
		setValidade(validade);
		this.codigo = codigo;
	}	
			
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Data getValidade() {
		return validade;
	}
	public void setValidade(Data validade) {
		this.validade = validade;
	}
	
public boolean valido(int year,int month,int day){
		
		Date data3 = new GregorianCalendar(year, month, day).getTime();

		Date data4 = new Date();
		if(data3.after(data4)){
			return true;
		}else if(data3.before(data4)){
			return false;
		}else{
			return true;
		}		
	}
}
