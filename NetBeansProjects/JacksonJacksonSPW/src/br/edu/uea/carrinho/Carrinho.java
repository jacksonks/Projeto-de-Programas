package br.edu.uea.carrinho;

import java.util.ArrayList;
import br.edu.uea.estoque.Estoque;
import br.edu.uea.itemProduto.ItemProduto;
import br.edu.uea.spw.SupermercadoWeb;

public class Carrinho {
	private SupermercadoWeb supermercadoWeb;
	private ArrayList<ItemProduto> itens;	

	public void setItens(ArrayList<ItemProduto> itens) {
		this.itens = itens;
	}

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
		itens.remove(item);

	}
	public ArrayList<ItemProduto> getItens(){
		return itens;
	}
	public String getItens1(){
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
		double temp=0;
		for (int i = 0; i < itens.size();i++){
			temp += itens.get(i).getProduto().getPreco();
		}
		return temp;		
	}
}