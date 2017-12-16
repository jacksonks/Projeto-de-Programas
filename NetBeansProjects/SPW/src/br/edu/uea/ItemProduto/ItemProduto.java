package br.edu.uea.ItemProduto;
import br.edu.uea.Carrinho.Carrinho;
import br.edu.uea.Data.Data;
import br.edu.uea.Estoque.Estoque;
import br.edu.uea.Produto.Produto;

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
	
	public boolean valido(){
		return false;

	}
}