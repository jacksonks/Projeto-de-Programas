package br.edu.uea.estoque;

import java.util.ArrayList;

import br.edu.uea.genero.Genero;
import br.edu.uea.itemProduto.ItemProduto;
import br.edu.uea.marca.Marca;
import br.edu.uea.produto.Produto;
import br.edu.uea.spw.SupermercadoWeb;

public class Estoque {
	private SupermercadoWeb supermercadoWeb;
	private ArrayList<ItemProduto> produtos;


	public Estoque(){
		this.produtos = new ArrayList<ItemProduto>();
	}
	public void entraItem(ItemProduto item){
		produtos.add(item);
	}
	public void saiItem(ItemProduto p){
		produtos.remove(p);
	}

	public ArrayList<ItemProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ItemProduto> produtos) {
		this.produtos = produtos;
	}


	public ArrayList<ItemProduto> getEstoque() {
		return produtos;
	}
	public void setEstoque(ArrayList<ItemProduto> estoque) {
		this.produtos = estoque;
	}

	public SupermercadoWeb getSupermercadoWeb() {
		return supermercadoWeb;
	}
	public void setSupermercadoWeb(SupermercadoWeb supermercadoWeb) {
		this.supermercadoWeb = supermercadoWeb;
	}
	public void mostraEstoque(){
		for (int i = 0; i < produtos.size();i++){
			System.out.println(produtos.get(i).getProduto().getCodigo()+"  -  "+produtos.get(i).getProduto().getNome()+"  -  "+produtos.get(i).getProduto().getGenero().getNome()+"  -  "+
					produtos.get(i).getProduto().getMarca().getNome()+"  -  "+produtos.get(i).getProduto().getPreco()+"  -  "+
					produtos.get(i).getValidade().toString(produtos.get(i).getValidade().getAno(),produtos.get(i).getValidade().getMes(), produtos.get(i).getValidade().getDia())+"  -  "+
					produtos.get(i).getValidade().ehValido(produtos.get(i).getValidade().getAno(),produtos.get(i).getValidade().getMes(), produtos.get(i).getValidade().getDia()));

		}
		System.out.println("\nTOTAL: "+produtos.size()+" itens no estoque");
	}
	public ArrayList<ItemProduto> getItens(){
		return produtos;
	}

	public int qtdItens(){
		
		return produtos.size();

	}
	public ArrayList<ItemProduto> getItens(Marca marca){
		ArrayList<ItemProduto> temp1 = new ArrayList<ItemProduto>();
		for (int i = 0; i < produtos.size();i++){
			if(produtos.get(i).getProduto().getMarca().getNome() == marca.getNome()){
				temp1.add(produtos.get(i));
			}			
		}
		return temp1;

	}
	public ArrayList<ItemProduto> getItens(Produto produto){
		ArrayList<ItemProduto> temp1 = new ArrayList<ItemProduto>();
		for (int i = 0; i < produtos.size();i++){
			if(produtos.get(i).getProduto().getNome() == produto.getNome()){
				temp1.add(produtos.get(i));
			}			
		}
		return temp1;

	}
	public ArrayList<ItemProduto> getItens(Genero genero){
		ArrayList<ItemProduto> temp1 = new ArrayList<ItemProduto>();
		for (int i = 0; i < produtos.size();i++){
			if(produtos.get(i).getProduto().getGenero().getNome() == genero.getNome()){
				temp1.add(produtos.get(i));
			}			
		}
		return temp1;

	}

}
