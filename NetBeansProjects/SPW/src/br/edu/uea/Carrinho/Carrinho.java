package br.edu.uea.Carrinho;

import java.util.ArrayList;

import br.edu.uea.Estoque.Estoque;
import br.edu.uea.ItemProduto.ItemProduto;
import br.edu.uea.SPW.SupermercadoWeb;

public class Carrinho {
	private SupermercadoWeb supermercadoWeb;
	private ArrayList<ItemProduto> itens;	

	public Carrinho(){
		this.itens = new ArrayList<ItemProduto>();
	}

	public SupermercadoWeb getSupermercadoWeb() {
		return supermercadoWeb;
	}
	public void setSupermercadoWeb(SupermercadoWeb supermercadoWeb) {
		this.supermercadoWeb = supermercadoWeb;
	}
	public void adicionaItem(ItemProduto item, Estoque estoque){
		itens.add(item);
		estoque.saiItem(item);
	}
	public void removeItem(ItemProduto item, Estoque estoque){
		estoque.entraItem(item);
		this.itens.remove(item);
		
	}
	public String getItens(){
		float precoTotal = 0;
		String retorno = "";
		for(int i=0; i < itens.size();i++){
			retorno+= itens.get(i).getProduto().getCodigo()+"  -  "+itens.get(i).getProduto().getNome()+"  -  "+itens.get(i).getProduto().getGenero().getNome()+"  -  "+
					itens.get(i).getProduto().getMarca().getNome()+"  -  "+itens.get(i).getProduto().getPreco()+"  -  "+
					itens.get(i).getValidade().toString(itens.get(i).getValidade().getAno(),itens.get(i).getValidade().getMes(), itens.get(i).getValidade().getDia())+"  -  "+
					itens.get(i).getValidade().ehValido(itens.get(i).getValidade().getAno(),itens.get(i).getValidade().getMes(), itens.get(i).getValidade().getDia())+"\n";
			precoTotal+=itens.get(i).getProduto().getPreco();		
		}
		retorno += "\nTOTAL: "+itens.size()+" itens no carrinho";
		retorno += "\nTotal a pagar: "+precoTotal;
		return retorno;		
	}
	public double totalAPagar(){
		return 0;		
	}
}
